package com.bs.biz.impl;

import com.bs.base.model.account.User;
import com.bs.biz.mapper.account.UserMapper;
import com.bs.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xianyang on 2018/2/4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long userId) {
        return userMapper.findById(userId);
    }
}
