package com.itheima.ssm.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Role {
    private String id;
    private String roleName;
    private String roleDesc;
    private List<Permission> permissions;
    private List<UserInfo> users;


}
