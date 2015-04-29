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
        return "login";
    }
    @RequestMapping("test")
    public String test(){
        return "test";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("login_success")
    public String login_success(){
        return "login_success" ;
    }
    @RequestMapping("401")
    public String error401(){
        return "401";
    }
    @RequestMapping("405")
    public String error405(){
        return "405";
    }
    @RequestMapping("500")
    public String error500(){
        return "500";
    }
    @RequestMapping("dashboard")
    public String dashboard(){
        return "dashboard";
    }
    @RequestMapping("template")
    public String template(){
        return "template";
    }

    @RequestMapping("templates")
     public String templates(){
        return "templates";
    }
    @RequestMapping("tem")
    public String tem(){
        return "tem";
    }

}
