package com.springmvc.cms.controller;

import com.springmvc.cms.model.AllSubject;
import com.springmvc.cms.model.Student;
import com.springmvc.cms.model.StudentApartment;
import com.springmvc.cms.model.StudentBody;
import com.springmvc.cms.service.SelectStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * 处理登录后菜单点击跳转
 * @Author Michael Liu
 * @Date 2015-05-03 13:50
 */
@Controller
@RequestMapping("/in")
public class IndexController {

    @Resource(name = "selectStudentService")
    private SelectStudentService selectStudentService;

    @RequestMapping(value = "/basicinfo")
    public ModelAndView selectInfo(HttpServletRequest request,HttpServletResponse response) throws Exception{

        String id = request.getParameter("id");
        Map<String,Object> map = new HashMap<String, Object>();

        List<Student> result = this.selectStudentService.find(id);
        map.put("result",result) ;
        return new ModelAndView("welcome/basicinfo",map);
    }

    @RequestMapping(value = "/regis")
    public ModelAndView regis(HttpServletRequest request,HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        Map<String, Object> map = new HashMap<String, Object>();

        List<Student> result = this.selectStudentService.find(id);
        map.put("result", result);
        return new ModelAndView("welcome/regis", map);
    }


    @RequestMapping(value = "/apartm")
    public ModelAndView apartm(HttpServletRequest request,HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        Map<String, Object> map = new HashMap<String, Object>();

        List<StudentApartment> result = this.selectStudentService.find_apartment(id);
        map.put("result", result);
        return new ModelAndView("welcome/apartm", map);
    }

    @RequestMapping(value = "/body")
    public ModelAndView body(HttpServletRequest request,HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        Map<String, Object> map = new HashMap<String, Object>();

        List<StudentBody> result = this.selectStudentService.find_body(id);
        map.put("result", result);
        return new ModelAndView("welcome/body", map);
    }


    @RequestMapping(value = "/score")
    public ModelAndView score(HttpServletRequest request,HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        Map<String, Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.selectStudentService.find_subject(id);
        map.put("result", result);
        return new ModelAndView("welcome/score", map);
    }

    @RequestMapping(value = "/class_score")
    public ModelAndView class_score(HttpServletRequest request,HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        Map<String, Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.selectStudentService.find_subject(id);
        map.put("result", result);
        return new ModelAndView("welcome/class_score", map);
    }

    @RequestMapping(value = "/subject_table")
    public ModelAndView subject_table(HttpServletRequest request,HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        Map<String, Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.selectStudentService.find_subject(id);
        map.put("result", result);
        return new ModelAndView("welcome/subject_table", map);
    }

    @RequestMapping(value = "/change_passwd")
    public ModelAndView change_passwd(HttpServletRequest request,HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
       /* Map<String, Object> map = new HashMap<String, Object>();

        List<AllSubject> result = this.selectStudentService.find_subject(id);
        map.put("result", result);*/
        return new ModelAndView("welcome/change_passwd");
    }




}
