package com.bs.biz.impl.common;

import com.bs.base.model.common.Menu;
import com.bs.biz.mapper.common.MenuMapper;
import com.bs.biz.service.common.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by xianyang on 2018/2/16.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findAll() {
        List<Menu> menus = menuMapper.findByParent("0");
        if(!CollectionUtils.isEmpty(menus)){
            menus.stream().forEach(this::fillChildren);
        }
        return menus;
    }

    //向下寻找子菜单
    private Menu fillChildren(Menu menu){
        List<Menu> children = menuMapper.findByParent(menu.getMenuNo());
        if(!CollectionUtils.isEmpty(children)){
            menu.setChildren(children);
            children.stream().forEach(this::fillChildren);
        }
        return menu;
    }
}
