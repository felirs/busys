package com.bs.biz.impl.account;

import com.bs.base.model.account.Role;
import com.bs.biz.mapper.account.RoleMapper;
import com.bs.base.model.PageCondition;
import com.bs.biz.service.account.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xianyang on 2018/2/18.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role create(Role role) {
        roleMapper.create(role);
        return role;
    }

    @Override
    public Role update(Role role) {
        roleMapper.update(role);
        return role;
    }

    @Override
    public void delete(Role role) {
        roleMapper.delete(role);
    }

    @Override
    public List<Role> search(PageCondition condition) {
        return roleMapper.search(condition);
    }
}
