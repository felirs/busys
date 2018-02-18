package com.bs.biz.impl.account;

import com.bs.base.model.account.Authority;
import com.bs.biz.mapper.account.AuthorityMapper;
import com.bs.base.model.PageCondition;
import com.bs.biz.service.account.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xianyang on 2018/2/18.
 */
@Service
public class AuthorityServiceImpl implements AuthorityService{

    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public Authority create(Authority authority) {
        authorityMapper.create(authority);
        return authority;
    }

    @Override
    public Authority update(Authority authority) {
        authorityMapper.update(authority);
        return authority;
    }

    @Override
    public void delete(Authority authority) {
        authorityMapper.delete(authority);
    }

    @Override
    public List<Authority> search(PageCondition condition) {
        return null;
    }
}
