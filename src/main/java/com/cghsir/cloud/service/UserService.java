package com.cghsir.cloud.service;

import com.cghsir.cloud.model.User;
import com.cghsir.cloud.model.UserExample;

import java.util.List;

/**
 * Created by cghsir on 2017/7/26.
 */
public interface UserService {

     /**
      * 根据例子查询一组用户
      * @param example
      * @return
      */
     List<User> selectByExample(UserExample example);

     /**
      * 根据例子查询一个用户
      * @param example
      * @return
      */
     User selectOneByExample(UserExample example);
}
