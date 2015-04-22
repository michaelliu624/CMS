package com.springmvc.cms.impl;

import com.springmvc.cms.dao.UserDao;
import com.springmvc.cms.model.User;
import com.springmvc.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Michael Liu
 * @Date 2015-04-22 19:47
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user){
        return userDao.insertUser(user);
    }

    @Override
    public void queryUser(){

    }
}
