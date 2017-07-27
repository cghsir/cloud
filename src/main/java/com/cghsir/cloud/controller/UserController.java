package com.cghsir.cloud.controller;

import com.cghsir.cloud.mapper.UserMapper;
import com.cghsir.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cghsir on 2017/7/24.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper UserMapper;

    @RequestMapping("/query")
    public User query(@RequestParam Long id) {
        User user = UserMapper.selectByPrimaryKey(id);
        return user;
    }
}
