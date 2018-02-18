package com.bs.biz.service.account;

import com.bs.base.model.account.Authority;
import com.bs.base.model.PageCondition;

import java.util.List;

/**
 * Created by xianyang on 2018/2/18.
 */
public interface AuthorityService {

    Authority create(Authority authority);

    Authority update(Authority authority);

    void delete(Authority authority);

    List<Authority> search(PageCondition condition);

}
