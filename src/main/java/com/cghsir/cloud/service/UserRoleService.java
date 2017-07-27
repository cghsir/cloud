package com.cghsir.cloud.service;

import com.cghsir.cloud.model.Role;
import com.cghsir.cloud.model.User;

import java.util.List;
import java.util.Set;

/**
 * Created by cghsir on 2017/7/26.
 */
public interface UserRoleService {

    /**
     * 根据用户查询角色集合
     * @param user
     * @return
     */
    List<Role> selectRolesByUser(User user);

    /**
     * 根据用户查询角色字符串集合
     * @param user
     * @return
     */
    Set<String> selectRolesStrByUser(User user);
}
