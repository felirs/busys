package com.bs.web;

import com.bs.biz.service.common.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xianyang on 2018/2/16.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("menus", menuService.findAll());
        return view;
    }
}
