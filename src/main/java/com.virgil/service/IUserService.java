package com.virgil.service;

import com.virgil.model.User;

/**
 * Created by Administrator on 2017/10/15 0015.
 */
public interface IUserService {
    public User selectUser(int userId);
}