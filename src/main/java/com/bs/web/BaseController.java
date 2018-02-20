package com.bs.web;

import com.bs.biz.service.common.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xianyang on 2018/2/20.
 */
@Controller
public class BaseController {

    @Autowired
    private MenuService menuService;

    protected ModelAndView getViewWithMenu(String viewName){
        ModelAndView view = new ModelAndView(viewName);
        view.addObject("menus", menuService.findAll());
        return view;
    }
}
