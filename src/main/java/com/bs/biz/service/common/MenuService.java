package com.bs.biz.service.common;

import com.bs.base.model.common.Menu;

import java.util.List;

/**
 * Created by xianyang on 2018/2/16.
 */
public interface MenuService {

    List<Menu> findAll();

    void update(Menu menu);

}
