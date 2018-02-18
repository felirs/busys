package com.bs.base.model.account;

import com.bs.base.model.common.BaseModel;

/**
 * Created by xianyang on 2018/jquery_easyui/20.
 */
public class User extends BaseModel {

    private static final long serialVersionUID = -2915121212531913756L;

    private String userName;

    private String userCode;

    private String password;

    private String realName;

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
}
