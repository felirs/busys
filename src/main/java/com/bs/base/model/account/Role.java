package com.bs.base.model.account;

import com.bs.base.model.common.BaseModel;

/**
 * Created by xianyang on 2018/2/18.
 */
public class Role extends BaseModel{

    private static final long serialVersionUID = -7946868961891317249L;

    //角色编码
    private String roleCode;

    //角色名称
    private String roleName;

    //权限
    private String authorities;

    //是否是系统内置
    private Boolean system;

    //是否启用
    private Boolean enabled;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
