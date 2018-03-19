package com.bs.biz.mapper.account;

import com.bs.base.model.account.User;
import com.bs.base.model.account.bo.UserBo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xianyang on 2018/2/4.
 */
@Mapper
public interface UserMapper {

    User create(User user);

    User findById(Long userId);

    UserBo findByUserName(String userName);

    List<UserBo> searchAll();

    Long deleteById(Long userId);

}
