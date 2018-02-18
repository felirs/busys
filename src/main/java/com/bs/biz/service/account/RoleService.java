package com.bs.biz.service.account;

import com.bs.base.model.account.Role;
import com.bs.base.model.PageCondition;

import java.util.List;

/**
 * Created by xianyang on 2018/2/18.
 */
public interface RoleService {

    Role create(Role role);

    Role update(Role role);

    void delete(Role role);

    List<Role> search(PageCondition condition);

}
