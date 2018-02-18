package com.bs.base.model;

import java.io.Serializable;

/**
 * Created by xianyang on 2018/2/18.
 */
public class PageCondition implements Serializable {

    private static final long serialVersionUID = -722021483802789497L;

    private Integer start = 0;

    private Integer limit = 20;

    private Integer page = 1;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
