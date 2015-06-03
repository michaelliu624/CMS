package com.springmvc.cms.service;

import com.springmvc.cms.model.StudentLogin;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 17:27
 */
public interface StudentLoginService {

    List<StudentLogin> getStudentByID(String id);

    List<StudentLogin> getStudentNameByID(String id);

    List<StudentLogin> getStudentPasswdByID(String str);

    List<StudentLogin> getStudentRoleByID(String str);

    List<StudentLogin> getStudentPermissionByID(String str);


    List<StudentLogin> getTeacherByID(String id);

    List<StudentLogin> getTeacherNameByID(String id);

    List<StudentLogin> getTeacherPasswdByID(String str);

    List<StudentLogin> getTeacherRoleByID(String str);

    List<StudentLogin> getTeacherPermissionByID(String str);


    List<StudentLogin> getAdminByID(String id);

    List<StudentLogin> getAdminNameByID(String id);

    List<StudentLogin> getAdminPasswdByID(String str);

    List<StudentLogin> getAdminRoleByID(String str);

    List<StudentLogin> getAdminPermissionByID(String str);
}
