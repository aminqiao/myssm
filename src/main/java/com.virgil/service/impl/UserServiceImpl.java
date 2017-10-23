package com.virgil.service.impl;

import com.virgil.dao.UserMapper;
import com.virgil.model.User;
import com.virgil.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/10/15 0015.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    public User selectUser(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

}
