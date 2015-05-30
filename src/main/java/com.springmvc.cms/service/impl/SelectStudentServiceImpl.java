package com.springmvc.cms.service.impl;

import com.springmvc.cms.mapper.SelectStudentMapper;
import com.springmvc.cms.model.Student;
import com.springmvc.cms.service.SelectStudentService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Michael Liu
 * @Date 2015-05-30 12:08
 */

@Repository(value = "selectStudentService")
@Transactional
public class SelectStudentServiceImpl implements SelectStudentService{

    @Resource(name = "selectStudentMapper")
    private SelectStudentMapper selectStudentMapper;

    @Override
    public List<Student> find(){
        String select_sql = "select * from student_test.student";
        return this.selectStudentMapper.operateReturnBeans(select_sql) ;
    }
}
