package com.cghsir.cloud.service;

import com.cghsir.cloud.BaseTest;
import com.cghsir.cloud.model.User;
import com.cghsir.cloud.model.UserExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cghsir on 2017/7/26.
 */
public class UserServiceTest extends BaseTest{

    @Autowired
    private UserService userService;

    @Test
    public void testSelectOneByExample(){
        User user = new User();
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo("张华");
        user = userService.selectOneByExample(example);
        System.out.println(user.toString());
    }
}
