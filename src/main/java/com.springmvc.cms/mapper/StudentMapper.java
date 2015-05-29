package com.springmvc.cms.mapper;

import com.springmvc.cms.model.Student;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-27 16:55
 */
public interface StudentMapper {

    public Student getId(String studentID);

    public Student getClass(String studentID);

    public List<Student> getStudentAll();

    public void insertStudent(Student student);

    public void deleteStudent(Student student);

    public void updateStudent(Student student);



}
