package com.bs.base.model.account;

import com.bs.base.model.common.BaseModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by xianyang on 2018/jquery_easyui/20.
 */
public class User extends BaseModel {

    private static final long serialVersionUID = -2915121212531913756L;

    //用户名
    private String userName;

    //用户编码
    private String userCode;

    //密码
    @JsonIgnore
    private String password;

    //真实姓名
    private String realName;

    //角色
    private String roles;

    //权限编码
    private String authNos;

    //是否锁定
    private Boolean locked = false;

    //是否启动
    private Boolean enabled = true;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAuthNos() {
        return authNos;
    }

    public void setAuthNos(String authNos) {
        this.authNos = authNos;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
