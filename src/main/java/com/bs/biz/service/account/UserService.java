package com.bs.biz.service.account;

import com.bs.base.model.account.User;
import com.bs.base.model.account.bo.UserBo;

import java.util.List;

/**
 * Created by xianyang on 2018/2/4.
 */
public interface UserService {

    User findById(Long userId);

    UserBo findByUserName(String userName);

    List<UserBo> searchAll();

    void deleteById(Long userId);
}
