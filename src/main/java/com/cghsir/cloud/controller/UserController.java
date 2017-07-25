package com.cghsir.cloud.controller;

import com.cghsir.cloud.mapper.UsersMapper;
import com.cghsir.cloud.model.Users;
import com.cghsir.cloud.model.UsersExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Created by cghsir on 2017/7/24.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersMapper usersMapper;

    @RequestMapping("/query")
    public Users query(@RequestParam String id) {
        Users user = usersMapper.selectByPrimaryKey(id);
        return user;
    }

    @RequestMapping("/save")
    public Users save() {
        String id = UUID.randomUUID().toString();
        Users users = new Users(id, UUID.randomUUID().toString(), UUID.randomUUID().toString());
        usersMapper.insertSelective(users);
        return usersMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("queryLike")
    public List<Users> queryLike(){
        UsersExample example = new UsersExample();
        example.createCriteria().andIdLike("%a%");
        UsersExample.Criteria c2 = example.createCriteria();
        c2.andPasswordLike("%b%");
        example.or(c2);
        PageHelper.startPage(1, 10);
        return usersMapper.selectByExample(example);
    }
}
