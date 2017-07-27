package com.cghsir.cloud.dao;

import com.cghsir.cloud.BaseTest;
import com.cghsir.cloud.mapper.UserMapper;
import com.cghsir.cloud.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by cghsir on 2017/7/26.
 */
public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper UserMapper;

    @Test
    public void testInsertUser(){
        User User = new User();
        User.seUsername("张华");
        User.setPassword("666666");
        User.setSalt("888888");
        User.setCreateDate(new Date());
        User.setStatus("1");
        UserMapper.insertSelective(User);
    }

    @Test
    public void testSelectByPrimaryKey(){
        User user = UserMapper.selectByPrimaryKey(5L);
        System.out.println(user.toString());
    }
}
