package com.springmvc.test;

import com.springmvc.cms.model.User;
import com.springmvc.cms.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Michael Liu
 * @Date 2015-04-22 20:27
 */
public class UserTest {

    private UserService userService;
    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
            ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService)context.getBean("userServiceImpl");
    }
    @Test
    public void addUser(){
        User user = new User();
        user.setId("111111111");
        user.setName("ceshi");
        System.out.println(userService.insertUser(user));
    }

}
