package com.springmvc.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Michael Liu
 * @Date 2015-04-22 21:15
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    /*@RequestMapping("/")
    public String main(){
        return "login";
    }*/
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping("/login_success")
    public String login_success(){
        return "login_success" ;
    }
    @RequestMapping("/401")
    public String error401(){
        return "401";
    }
    @RequestMapping("/405")
    public String error405(){
        return "405";
    }
    @RequestMapping("/500")
    public String error500(){
        return "500";
    }
    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
    @RequestMapping("/template")
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
    @RequestMapping("/getUserInfo")
    public String getUserInfo(HttpServletRequest request){
        String currentUser = (String)request.getSession().getAttribute("currentUser");
        System.out.println("当前登录的用户为[" + currentUser + "]");
        request.setAttribute("currUser", currentUser);
        return "getUserInfo";
    }
    @RequestMapping("/listUser")
    public String listUser(){
        return "listUser";
    }
    @RequestMapping("/error_fileupload")
    public String error_fileupload(){
        return "error_fileupload";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }



}
