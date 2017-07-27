package com.cghsir.cloud.service;

import com.cghsir.cloud.BaseTest;
import com.cghsir.cloud.model.User;
import com.cghsir.cloud.model.UserExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Created by cghsir on 2017/7/26.
 */
public class UserRoleServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Test
    public void testSelectRolesStrByUser(){
        User user;
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo("张华");
        user = userService.selectOneByExample(example);
        Set<String> roles = userRoleService.selectRolesStrByUser(user);
        System.out.println(roles);
    }
}
