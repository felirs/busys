package com.bs.web;

import com.bs.base.model.common.Menu;
import com.bs.biz.service.common.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by xianyang on 2018/2/16.
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController{

    @Autowired
    private MenuService menuService;

    @RequestMapping("index")
    public ModelAndView index(HttpSession session) {
        return this.getViewWithMenu("index");
    }

    @RequestMapping("menu/all")
    @ResponseBody
    public List<Menu> allMenus(){
        return menuService.findAll();
    }
}
