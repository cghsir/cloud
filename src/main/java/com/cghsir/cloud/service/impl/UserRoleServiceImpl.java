package com.cghsir.cloud.service.impl;

import com.cghsir.cloud.mapper.RoleMapper;
import com.cghsir.cloud.mapper.UserRoleMapper;
import com.cghsir.cloud.model.*;
import com.cghsir.cloud.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.*;

/**
 * Created by cghsir on 2017/7/26.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectRolesByUser(User user) {
        //根据用户ID查询角色
        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andUserIdEqualTo(user.getId());
        List<UserRole> userRoles = userRoleMapper.selectByExample(example);
        //角色为空直接返回
        if (ObjectUtils.isEmpty(userRoles)) return null;
        List<Long> roleIds = new ArrayList<Long>();
        //设置角色ID集合
        for (UserRole userRole : userRoles) {
            roleIds.add(userRole.getRoleId());
        }

        //查询所有角色
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andIdIn(roleIds);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        return roles;
    }

    @Override
    public Set<String> selectRolesStrByUser(User user) {
        Set<String> roleStrs = new HashSet<String>();
        List<Role> roles = this.selectRolesByUser(user);
        if (ObjectUtils.isEmpty(roles)) return null;
        for (Role role : roles) {
            roleStrs.add(role.getRole());
        }
        return roleStrs;
    }
}
