package com.springmvc.cms.service;

import com.springmvc.cms.model.AllSubject;
import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.StudentApartment;
import com.springmvc.cms.model.StudentBody;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 12:05
 */
public interface SelectStudentService {

   /* 查询测试，查询所有*/

    List<Student> find(String id);

    List<StudentApartment> find_apartment(String id);

    List<StudentBody> find_body(String id);

    List<AllSubject> find_subject(String id);
}
