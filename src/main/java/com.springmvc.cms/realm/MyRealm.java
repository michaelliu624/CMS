package com.springmvc.cms.realm;

import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.StudentLogin;
import com.springmvc.cms.service.SelectStudentService;
import com.springmvc.cms.service.StudentLoginService;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * 自定义的指定Shiro验证用户登录的类
 * @Author Michael Liu
 * @Date 2015-04-29 14:17
 */
public class MyRealm extends AuthorizingRealm{
    /**
     * 为当前登录的Subject授予角色和权限
     * @see 经测试:本例中该方法的调用时机为需授权资源被访问时
     * @see 经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache
     * @see 个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持,则可灵活决定是否启用AuthorizationCache
     * @see 比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache
     */
    @Resource(name = "studentLoginService")
    private StudentLoginService studentLoginService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
        String currentUsername = (String) super.getAvailablePrincipal(principals);
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        //获取学生ID
        List<StudentLogin> studentByID = this.studentLoginService.getStudentByID(currentUsername);
        //获取学生角色
        List<StudentLogin> studentRoleByID = this.studentLoginService.getStudentRoleByID(currentUsername);
        //获取学生权限
        List<StudentLogin> studentPermissionByID = this.studentLoginService.getStudentPermissionByID(currentUsername);

        //获取教师ID
        List<StudentLogin> teacherByID = this.studentLoginService.getTeacherByID(currentUsername);
        //获取教师角色
        List<StudentLogin> teacherRoleByID = this.studentLoginService.getTeacherRoleByID(currentUsername);
        //获取教师权限
        List<StudentLogin> teacherPermissionByID = this.studentLoginService.getTeacherPermissionByID(currentUsername);

        //获取管理员ID
        List<StudentLogin> adminByID = this.studentLoginService.getAdminByID(currentUsername);
        //获取管理员角色
        List<StudentLogin> adminRoleByID = this.studentLoginService.getAdminRoleByID(currentUsername);
        //获取管理员权限
        List<StudentLogin> adminPermissionByID = this.studentLoginService.getAdminPermissionByID(currentUsername);

        if (studentByID !=null && ! studentByID.isEmpty()) {
            String student_id = studentByID.get(0).getId();
            if (null != currentUsername && student_id.equals(currentUsername)) {
                //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色
                String student_role = studentRoleByID.get(0).getRole();
                String student_permission = studentPermissionByID.get(0).getPermisson();
                simpleAuthorInfo.addRole(student_role);
                //添加权限
                simpleAuthorInfo.addStringPermission(student_permission);
                System.out.println("已为用户[" + currentUsername + "]赋予了"+ student_role +"角色和"+ student_permission +"权限");
                return simpleAuthorInfo;
            }
        }else if (teacherByID !=null && ! teacherByID.isEmpty()) {
            String teacher = teacherByID.get(0).getId();
            if (null != currentUsername && teacher.equals(currentUsername)) {
                String teacher_role = teacherRoleByID.get(0).getRole();
                String teacher_permission = teacherPermissionByID.get(0).getPermisson();
                simpleAuthorInfo.addRole(teacher_role);
                //添加权限
                simpleAuthorInfo.addStringPermission(teacher_permission);
                System.out.println("已为用户[" + currentUsername + "]赋予了"+ teacher_role +"角色和"+ teacher_permission +"权限");
                return simpleAuthorInfo;
            }
        }else if (adminByID !=null && ! adminByID.isEmpty()) {
            String admin = adminByID.get(0).getId();
            if (null != currentUsername && admin.equals(currentUsername)) {
                String admin_role = adminRoleByID.get(0).getRole();
                String admin_permission = adminPermissionByID.get(0).getPermisson();
                simpleAuthorInfo.addRole(admin_role);
                //添加权限
                simpleAuthorInfo.addStringPermission(admin_permission);
                System.out.println("已为用户[" + currentUsername + "]赋予了"+ admin_role +"角色和"+ admin_permission +"权限");
                return simpleAuthorInfo;
            }
        }
        //若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址
        //详见applicationContext.xml中的<bean id="shiroFilter">的配置
        return null;
        }

    /**
     * 验证当前登录的Subject
     * @see 经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        //获取基于用户名和密码的令牌
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
        //两个token的引用都是一样的,本例中是org.apache.shiro.authc.UsernamePasswordToken@33799a1e

        UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
        System.out.println("验证当前Subject时获取到token为" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));

        //此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息
        //说白了就是第一个参数填登录用户名,第二个参数填合法的登录密码(可以是从数据库中取到的,本例中为了演示就硬编码了)
        //这样一来,在随后的登录页面上就只有这里指定的用户和密码才能通过验证
        List<StudentLogin> student_id = this.studentLoginService.getStudentByID(token.getUsername());
        List<StudentLogin> student_passwd = this.studentLoginService.getStudentPasswdByID(token.getUsername());

        List<StudentLogin> teacher_id = this.studentLoginService.getTeacherByID(token.getUsername());
        List<StudentLogin> teacher_passwd = this.studentLoginService.getTeacherPasswdByID(token.getUsername());

        List<StudentLogin> admin_id = this.studentLoginService.getAdminByID(token.getUsername());
        List<StudentLogin> admin_passwd = this.studentLoginService.getAdminPasswdByID(token.getUsername());
        if(student_id !=null && ! student_id.isEmpty() && student_passwd !=null && ! student_passwd.isEmpty()) {
                String id_select = student_id.get(0).getId();
                String passwd_select = student_passwd.get(0).getPasswd();
                if (id_select.equals(token.getUsername())) {
                    AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(id_select, passwd_select, this.getName());
                    this.setSession("currentUser", id_select);
                    return authcInfo;
                }
        }else if(teacher_id !=null && ! teacher_id.isEmpty() && teacher_passwd !=null && ! teacher_passwd.isEmpty()) {
            String id_select = teacher_id.get(0).getId();
            String passwd_select = teacher_passwd.get(0).getPasswd();
            if(id_select.equals(token.getUsername())) {
                AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(id_select, passwd_select, this.getName());
                this.setSession("currentUser", id_select);
                return authcInfo;
            }
        }else if(admin_id !=null && ! admin_id.isEmpty() && admin_passwd !=null && ! admin_passwd.isEmpty()) {
            String id_select = admin_id.get(0).getId();
            String passwd_select = admin_passwd.get(0).getPasswd();
            if (id_select.equals(token.getUsername())) {
                AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(id_select, passwd_select, this.getName());
                this.setSession("currentUser", id_select);
                return authcInfo;
            }
        }
        //没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常
        return null;
    }


    /**
     * 将一些数据放到ShiroSession中,以便于其它地方使用
     * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
     */
    private void setSession(Object key, Object value){
        Subject currentUser = SecurityUtils.getSubject();
        if(null != currentUser){
            Session session = currentUser.getSession();
            System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");
            if(null != session){
                session.setAttribute(key, value);
            }
        }
    }

}
