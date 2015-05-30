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
    public List<StudentLogin> getStudentByID(String str){
        String select_student_id_sql = "select id from student_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_student_id_sql) ;
    }

    @Override
    public List<StudentLogin> getStudentPasswdByID(String str){
        String select_student_passwd_sql = "select passwd from student_login_info where id='"+str+"'";
        return this.studentLoginMapper.operateReturnBeans(select_student_passwd_sql) ;
    }
}
