package com.cghsir.cloud;

import com.cghsir.cloud.mapper.UsersMapper;
import com.cghsir.cloud.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cghsir on 2017/7/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UsersMapper userMapper;

    @Test
    public void testFindUserById(){
        Users user = userMapper.selectByPrimaryKey("d3f37606-b73c-4cbb-b736-414dd95089b1");
        System.out.println(user);
    }
}
