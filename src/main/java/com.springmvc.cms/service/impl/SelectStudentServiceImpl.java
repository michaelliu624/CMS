package com.springmvc.cms.service.impl;

import com.springmvc.cms.mapper.SelectStudentApartmentMapper;
import com.springmvc.cms.mapper.SelectStudentBodyMapper;
import com.springmvc.cms.mapper.SelectStudentClassMapper;
import com.springmvc.cms.mapper.SelectStudentMapper;
import com.springmvc.cms.model.AllSubject;
import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.StudentApartment;
import com.springmvc.cms.model.StudentBody;
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
    public List<Student> find(String id){
        String select_sql = "select * from student_test.student where id ='"+ id +"'";
        return this.selectStudentMapper.operateReturnBeans(select_sql) ;
    }


    @Resource(name = "selectStudentApartmentMapper")
    private SelectStudentApartmentMapper selectStudentApartmentMapper;

    @Override
    public List<StudentApartment> find_apartment(String id){
        String select_sql = "select * from student_test.student_apartment where id ='"+ id +"'";
        return this.selectStudentApartmentMapper.operateReturnBeans(select_sql) ;
    }


    @Resource(name = "selectStudentBodyMapper")
    private SelectStudentBodyMapper selectStudentBodyMapper;

    @Override
    public List<StudentBody> find_body(String id){
        String select_sql = "select * from student_test.student_body where id ='"+ id +"'";
        return this.selectStudentBodyMapper.operateReturnBeans(select_sql) ;
    }

    @Resource(name = "selectStudentClassMapper")
    private SelectStudentClassMapper selectStudentClassMapper;
    @Override
    public List<AllSubject> find_subject(String id) {
        String select_sql = "SELECT\n" +
                "\t*\n" +
                "FROM\n" +
                "\t(\n" +
                "\t\tSELECT\n" +
                "\t\t\t*\n" +
                "\t\tFROM\n" +
                "\t\t\tclass_cyuyan\n" +
                "\t\tUNION\n" +
                "\t\t\tSELECT\n" +
                "\t\t\t\t*\n" +
                "\t\t\tFROM\n" +
                "\t\t\t\tclass_dandaixiaoshuo\n" +
                "\t\t\tUNION\n" +
                "\t\t\t\tSELECT\n" +
                "\t\t\t\t\t*\n" +
                "\t\t\t\tFROM\n" +
                "\t\t\t\t\tclass_dianlufenxi\n" +
                "\t\t\t\tUNION\n" +
                "\t\t\t\t\tSELECT\n" +
                "\t\t\t\t\t\t*\n" +
                "\t\t\t\t\tFROM\n" +
                "\t\t\t\t\t\tclass_english\n" +
                "\t\t\t\t\tUNION\n" +
                "\t\t\t\t\t\tSELECT\n" +
                "\t\t\t\t\t\t\t*\n" +
                "\t\t\t\t\t\tFROM\n" +
                "\t\t\t\t\t\t\tclass_jibenyueli\n" +
                "\t\t\t\t\t\tUNION\n" +
                "\t\t\t\t\t\t\tSELECT\n" +
                "\t\t\t\t\t\t\t\t*\n" +
                "\t\t\t\t\t\t\tFROM\n" +
                "\t\t\t\t\t\t\t\tclass_math\n" +
                "\t\t\t\t\t\t\tUNION\n" +
                "\t\t\t\t\t\t\t\tSELECT\n" +
                "\t\t\t\t\t\t\t\t\t*\n" +
                "\t\t\t\t\t\t\t\tFROM\n" +
                "\t\t\t\t\t\t\t\t\tclass_pe\n" +
                "\t\t\t\t\t\t\t\tUNION\n" +
                "\t\t\t\t\t\t\t\t\tSELECT\n" +
                "\t\t\t\t\t\t\t\t\t\t*\n" +
                "\t\t\t\t\t\t\t\t\tFROM\n" +
                "\t\t\t\t\t\t\t\t\t\tclass_tongxinyuanli\n" +
                "\t\t\t\t\t\t\t\t\tUNION\n" +
                "\t\t\t\t\t\t\t\t\t\tSELECT\n" +
                "\t\t\t\t\t\t\t\t\t\t\t*\n" +
                "\t\t\t\t\t\t\t\t\t\tFROM\n" +
                "\t\t\t\t\t\t\t\t\t\t\tclass_xingshizhengce\n" +
                "\t) tmp\n" +
                "WHERE\n" +
                "\tclass_student_id like '"+ id +"'";

        return this.selectStudentClassMapper.operateReturnBeans(select_sql) ;
    }
}
