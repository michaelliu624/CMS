package com.springmvc.cms.service;

import com.springmvc.cms.model.AllSubject;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-06-03 14:36
 */
public interface TeacherService {

    List<AllSubject> selectAllStudent(String id,String table);

    void insertStudent(String id, String table, String class_name, String class_teacher_id, String class_teacher_name, String class_student_id,String class_time);

    void updateStudent(String id, String table, String class_name, String class_teacher_id, String class_teacher_name, String class_student_id);

    void dropStudent(String class_student_id,String table);

    void updateScore(String class_student_id, String table,String score_ordinary,String score_exam,String score_final,String class_score);


}
