package com.springmvc.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 处理登录后菜单点击跳转
 * @Author Michael Liu
 * @Date 2015-05-03 13:50
 */
@Controller
@RequestMapping("/in")
public class IndexController {

    @RequestMapping("/subject")
    public String subject(){return "subject" ;}
    @RequestMapping("/score")
    public String score(){return "score" ;}
    @RequestMapping("/timetable")
    public String timetable(){return "timetable" ;}


}
