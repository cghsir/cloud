package com.cghsir.cloud.service.impl;

import com.cghsir.cloud.mapper.UserMapper;
import com.cghsir.cloud.model.User;
import com.cghsir.cloud.model.UserExample;
import com.cghsir.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * Created by cghsir on 2017/7/26.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectByExample(UserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectOneByExample(UserExample example) {
        List<User> users = this.selectByExample(example);
        return ObjectUtils.isEmpty(users) ? null : users.get(0);
    }
}
