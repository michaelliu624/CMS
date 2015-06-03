package com.springmvc.cms.controller;

import com.springmvc.cms.model.StudentLogin;
import com.springmvc.cms.service.StudentLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-04-22 21:15
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    /*@RequestMapping("/")
    public String main(){
        return "login";
    }*/
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping("/login_success")
    public String login_success(){
        return "login_success" ;
    }
    @RequestMapping("/401")
    public String error401(HttpServletRequest request){
        String currentUser = (String)request.getSession().getAttribute("currentUser");
        System.out.println("当前登录的用户为[" + currentUser + "]");
        request.setAttribute("currUser", currentUser);
        return "401";
    }
    @RequestMapping("/405")
    public String error405(){
        return "405";
    }
    @RequestMapping("/500")
    public String error500(){
        return "500";
    }
    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard_bak";
    }
    @RequestMapping("/template")
    public String template(){
        return "template";
    }

    @RequestMapping("templates")
     public String templates(){
        return "templates";
    }
    @RequestMapping("tem")
    public String tem(){
        return "tem";
    }
    @RequestMapping("/getUserInfo")
    public String getUserInfo(HttpServletRequest request){
        String currentUser = (String)request.getSession().getAttribute("currentUser");
        System.out.println("当前登录的用户为[" + currentUser + "]");
        request.setAttribute("currUser", currentUser);
        return "getUserInfo";
    }
    @RequestMapping("/listUser")
    public String listUser(){
        return "listUser";
    }
    @RequestMapping("/error_fileupload")
    public String error_fileupload(){
        return "error_fileupload";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/loginbak")
    public String loginbak(){
        return "loginbak";
    }
    @RequestMapping("/main")
    public String main(){
        return "/main";
    }
    @RequestMapping("/login_final")
    public String login_final(){
        return "/login_final";
    }
    @RequestMapping("/indexpage")
    public String indexpage(){
        return "indexpage";
    }

    @Resource(name = "studentLoginService")
    private StudentLoginService studentLoginService;

    @RequestMapping("/welcome_admin")
    public String welcome_admin(HttpServletRequest request){
        String currentUser = (String)request.getSession().getAttribute("currentUser");
        //获取管理员姓名
        List<StudentLogin> adminNameByID = this.studentLoginService.getAdminNameByID(currentUser);
        String admin_name = adminNameByID.get(0).getName();
        System.out.println("当前登录的用户为[" + currentUser +"----"+ admin_name +"]");
        request.setAttribute("currUser", currentUser);
        request.setAttribute("admin_name", admin_name);
        return "welcome_admin";
    }

    @RequestMapping("/welcome_student")
    public String welcome_student(HttpServletRequest request){
        String currentUser = (String)request.getSession().getAttribute("currentUser");
        //获取学生姓名
        List<StudentLogin> studentNameByID = this.studentLoginService.getStudentNameByID(currentUser);
        String student_name = studentNameByID.get(0).getName();
        System.out.println("当前登录的用户为[" + currentUser +"----"+ student_name +"]");
        request.setAttribute("currUser", currentUser);
        request.setAttribute("student_name", student_name);
        return "welcome_student";
    }

    @RequestMapping("/welcome_teacher")
    public String welcome_teacher(HttpServletRequest request){
        String currentUser = (String)request.getSession().getAttribute("currentUser");
        //获取教师姓名
        List<StudentLogin> teacherNameByID = this.studentLoginService.getTeacherNameByID(currentUser);
        String teacher_name = teacherNameByID.get(0).getName();
        System.out.println("当前登录的用户为[" + currentUser +"----"+ teacher_name +"]");
        request.setAttribute("currUser", currentUser);
        request.setAttribute("teacher_name", teacher_name);
        return "welcome_teacher";
    }

}
