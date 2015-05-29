package com.springmvc.cms.controller;

import com.springmvc.cms.mapper.StudentMapper;
import com.springmvc.cms.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Michael Liu
 * @Date 2015-05-29 15:42
 */
@Controller
public class TestController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "/rest/test/select" )
    public String  indexPage(){
        Student student = studentMapper.getId("11101060107");
        System.out.print("name: "+ student.getName());
        return "select";
    }
}
