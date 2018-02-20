package com.bs.biz.service.account;

import com.bs.base.model.account.User;
import com.bs.base.model.account.bo.UserBo;

/**
 * Created by xianyang on 2018/2/4.
 */
public interface UserService {

    User findById(Long userId);

    UserBo findByUserName(String userName);
}
