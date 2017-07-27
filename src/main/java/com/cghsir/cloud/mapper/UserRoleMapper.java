package com.cghsir.cloud.mapper;

import com.cghsir.cloud.model.UserRole;
import com.cghsir.cloud.model.UserRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole,UserRoleExample>{

}