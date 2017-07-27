package com.cghsir.cloud.mapper;

import com.cghsir.cloud.model.User;
import com.cghsir.cloud.model.UserExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User,UserExample>{

}