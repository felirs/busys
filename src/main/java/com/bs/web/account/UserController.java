package com.bs.web.account;

import com.bs.base.model.account.User;
import com.bs.base.model.account.bo.UserBo;
import com.bs.biz.service.account.UserService;
import com.bs.web.BaseController;
import com.bs.web.config.security.BsUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by xianyang on 2018/2/20.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public ModelAndView login(){
        return new ModelAndView("/account/login");
    }

    @RequestMapping("index")
    @PreAuthorize("#bsUserDetails != null")
    public ModelAndView userIndex(@AuthenticationPrincipal BsUserDetails bsUserDetails){
        return this.getViewWithMenu("/account/user/index");
    }

    @RequestMapping("all")
    @ResponseBody
    @PreAuthorize("#bsUserDetails != null")
    public List<UserBo> allUsers(@AuthenticationPrincipal BsUserDetails bsUserDetails){
        return userService.searchAll();
    }

    @RequestMapping("delete/{userId}")
    @ResponseBody
    @PreAuthorize("#bsUserDetails != null")
    public Boolean delete(
            @PathVariable(value = "userId") Long userId,
            @AuthenticationPrincipal BsUserDetails bsUserDetails){
        userService.deleteById(userId);
        return true;
    }

    @RequestMapping("add")
    @ResponseBody
    @PreAuthorize("#bsUserDetails != null")
    public void add(
            @RequestBody User user,
            @AuthenticationPrincipal BsUserDetails bsUserDetails){
        userService.create(user);
    }

}
