package com.bs.biz.mapper.account;

import com.bs.base.model.account.Role;
import com.bs.base.model.PageCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xianyang on 2018/2/18.
 */
@Mapper
public interface RoleMapper {

    Role create(Role role);

    Role update(Role role);

    Role delete(Role role);

    List<Role> search(PageCondition condition);

}
