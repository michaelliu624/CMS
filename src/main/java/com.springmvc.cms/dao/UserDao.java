package com.springmvc.cms.dao;

import com.springmvc.cms.model.User;

/**
 * 添加用户测试
 * @Author Michael Liu
 * @Date 2015-04-22 19:44
 */
public interface UserDao {
    public int insertUser(User user) ;

    public void queryUser();

}
