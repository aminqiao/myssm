package com.virgil.dao;

import com.virgil.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/15 0015.
 */
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
