package com.bs.web.config.security;

import com.bs.base.model.account.bo.UserBo;
import com.bs.biz.service.account.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by xianyang on 2018/2/20.
 */
@Component
public class BsUserDetailService implements UserDetailsService{

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserBo userBo = userService.findByUserName(userName);

        if(userBo == null || !userBo.getEnabled()){
            throw new UsernameNotFoundException(userName);
        }

        return new BsUserDetails(userBo);
    }
}
