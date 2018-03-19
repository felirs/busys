package com.bs.biz.impl.account;

import com.bs.base.model.account.User;
import com.bs.base.model.account.bo.UserBo;
import com.bs.biz.mapper.account.UserMapper;
import com.bs.biz.service.account.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xianyang on 2018/2/4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User create(User user) {
        userMapper.create(user);
        return user;
    }

    @Override
    public User findById(Long userId) {
        return userMapper.findById(userId);
    }

    @Override
    public UserBo findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

    @Override
    public List<UserBo> searchAll() {
        return userMapper.searchAll();
    }

    @Override
    public void deleteById(Long userId) {
        userMapper.deleteById(userId);
    }
}
