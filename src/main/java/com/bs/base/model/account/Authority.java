package com.bs.base.model.account;

import com.bs.base.model.common.BaseModel;

/**
 * Created by xianyang on 2018/2/18.
 */
public class Authority extends BaseModel {

    private static final long serialVersionUID = 4959535152671534118L;

    //权限编码
    private String authNo;

    //权限名称
    private String authName;

    //权限描述
    private String desc;

    //父权限
    private String parent;

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
