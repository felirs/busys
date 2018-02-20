package com.bs.web.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xianyang on 2018/2/20.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    public ModelAndView login(){
        return new ModelAndView("/account/login");
    }

}
