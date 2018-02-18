package com.bs.web;

import com.bs.base.model.account.User;
import com.bs.biz.service.account.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xianyang on 2018/jquery_easyui/20.
 */
@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView view = new ModelAndView("test");
        view.addObject("name","peflapos");
        return view;
    }

    @RequestMapping("/user/{userId}")
    @ResponseBody
    public User getById(@PathVariable(name = "userId")Long userId){
        User user = userService.findById(userId);
        return user;
    }

}
