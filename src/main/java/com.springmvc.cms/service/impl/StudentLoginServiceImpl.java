package com.springmvc.cms.service.impl;

import com.springmvc.cms.mapper.StudentLoginMapper;
import com.springmvc.cms.model.StudentLogin;
import com.springmvc.cms.service.StudentLoginService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 17:28
 */

@Repository(value = "studentLoginService")
@Transactional
public class StudentLoginServiceImpl implements StudentLoginService {

    @Resource(name = "studentLoginMapper")
    private StudentLoginMapper studentLoginMapper;

    @Override
    public List<StudentLogin> getStudentByID(String id){
        String select_student_id_sql = "select id from student_login_info where id='"+id+"'";
        return this.studentLoginMapper.operateReturnBeans(select_student_id_sql) ;
    }

    @Override
    public List<StudentLogin> getStudentNameByID(String id) {
        String select_student_name_sql = "select name from student_login_info where id='"+id+"'";
        return this.studentLoginMapper.operateReturnBeans(select_student_name_sql) ;
    }

    @Override
    public List<StudentLogin> getStudentPasswdByID(String str){
        String select_student_passwd_sql = "select passwd from student_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_student_passwd_sql) ;
    }

    @Override
    public List<StudentLogin> getStudentRoleByID(String str) {
        String select_student_role_sql = "select role from student_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_student_role_sql) ;
    }

    @Override
    public List<StudentLogin> getStudentPermissionByID(String str) {
        String select_student_permission_sql = "select permission from student_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_student_permission_sql) ;
    }

    @Override
    public List<StudentLogin> getTeacherByID(String id) {
        String select_teacher_id_sql = "select id from teacher_login_info where id='"+id+"'";
        return this.studentLoginMapper.operateReturnBeans(select_teacher_id_sql) ;
    }

    @Override
    public List<StudentLogin> getTeacherNameByID(String id) {
        String select_teacher_name_sql = "select name from teacher_login_info where id='"+id+"'";
        return this.studentLoginMapper.operateReturnBeans(select_teacher_name_sql) ;
    }

    @Override
    public List<StudentLogin> getTeacherPasswdByID(String str) {
        String select_teacher_passwd_sql = "select passwd from teacher_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_teacher_passwd_sql) ;
    }

    @Override
    public List<StudentLogin> getTeacherRoleByID(String str) {
        String select_teacher_role_sql = "select role from teacher_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_teacher_role_sql) ;
    }

    @Override
    public List<StudentLogin> getTeacherPermissionByID(String str) {
        String select_teacher_permission_sql = "select permission from teacher_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_teacher_permission_sql) ;
    }

    @Override
    public List<StudentLogin> getAdminByID(String id) {
        String select_admin_id_sql = "select id from admin_login_info where id='"+id+"'";
        return this.studentLoginMapper.operateReturnBeans(select_admin_id_sql) ;
    }

    @Override
    public List<StudentLogin> getAdminNameByID(String id) {
        String select_admin_name_sql = "select name from admin_login_info where id='"+id+"'";
        return this.studentLoginMapper.operateReturnBeans(select_admin_name_sql) ;
    }

    @Override
    public List<StudentLogin> getAdminPasswdByID(String str) {
        String select_admin_passwd_sql = "select passwd from admin_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_admin_passwd_sql) ;
    }

    @Override
    public List<StudentLogin> getAdminRoleByID(String str) {
        String select_admin_role_sql = "select role from admin_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_admin_role_sql) ;
    }

    @Override
    public List<StudentLogin> getAdminPermissionByID(String str) {
        String select_admin_permission_sql = "select permission from admin_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_admin_permission_sql) ;
    }
}
