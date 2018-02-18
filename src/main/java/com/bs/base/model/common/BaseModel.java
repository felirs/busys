package com.bs.base.model.common;

import java.io.Serializable;

/**
 * Created by xianyang on 2018/jquery_easyui/20.
 */
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 4551869726893380169L;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
