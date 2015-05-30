package com.springmvc.cms.service;

import com.springmvc.cms.model.StudentLogin;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 17:27
 */
public interface StudentLoginService {

    List<StudentLogin> getStudentByID(String id);

    List<StudentLogin> getStudentPasswdByID(String str);
}
