package com.springmvc.cms.controller;

import com.springmvc.cms.model.Student;
import com.springmvc.cms.service.SelectStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 处理登录后菜单点击跳转
 * @Author Michael Liu
 * @Date 2015-05-03 13:50
 */
@Controller
@RequestMapping("/in")
public class IndexController {

    /*@RequestMapping("/subject")
    public String subject(){return "welcome/subject";}*/
    @RequestMapping("/score")
    public String score(){return "welcome/score";}
    @RequestMapping("/timetable")
    public String timetable(){return "welcome/timetable";}

    @Resource(name = "selectStudentService")
    private SelectStudentService selectStudentService;
    @RequestMapping(value = "/subject")
    public ModelAndView selctInfo(HttpServletResponse response) throws Exception{

        Map<String,Object> map = new HashMap<String, Object>();

        List<Student> result = this.selectStudentService.find();
        map.put("result",result);
        return new ModelAndView("welcome/subject",map);
    }


}
