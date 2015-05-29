package com.springmvc.test;

import com.springmvc.cms.mapper.StudentMapper;
import com.springmvc.cms.model.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-29 15:20
 */

public class StudentTestTemp {

    private StudentMapper studentMapper;

    public StudentTestTemp() {
    }

    public void getStudentTest(String id){
        Student student = studentMapper.getId(id);
        System.out.print(student.getId() +"-----"+ student.getName());

        List<Student> students = studentMapper.getStudentAll();
        for( Student student1 : students){
            System.out.println(student1.getName() + "-----" + student1.getSex());
        }
    }

    public static void main(String[] args){
        StudentTestTemp studentTestTemp = new StudentTestTemp();
        studentTestTemp.getStudentTest("11101060107");
    }
}
