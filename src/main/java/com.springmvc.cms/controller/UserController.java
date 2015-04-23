package com.springmvc.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Michael Liu
 * @Date 2015-04-22 21:15
 */

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("/")
    public String main(){
        return "main";
    }
    @RequestMapping("test")
    public String test(){
        return "test";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
