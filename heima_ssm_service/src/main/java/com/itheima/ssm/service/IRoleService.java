package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IRoleService {
    public List<Role> findAll()throws Exception;

    void save(Role role) throws Exception;

    List<Permission> findRoleByIdAndAllPermission(String roleId) throws Exception;

    Role findById(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
