package com.bs.base.model.account.bo;

import com.bs.base.model.account.User;

/**
 * Created by xianyang on 2018/2/20.
 */
public class UserBo extends User {

    private static final long serialVersionUID = -30930578490313468L;

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
