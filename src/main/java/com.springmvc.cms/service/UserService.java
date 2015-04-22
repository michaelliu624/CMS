package com.springmvc.cms.service;

import com.springmvc.cms.model.User;

/**
 * @Author Michael Liu
 * @Date 2015-04-22 19:46
 */
public interface UserService {
    public int insertUser(User user);

    public void queryUser();
}
