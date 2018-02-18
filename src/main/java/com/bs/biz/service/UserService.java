package com.bs.biz.service;

import com.bs.base.model.account.User;

/**
 * Created by xianyang on 2018/2/4.
 */
public interface UserService {
    User findById(Long userId);
}
