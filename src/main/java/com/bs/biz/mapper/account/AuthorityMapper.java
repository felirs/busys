package com.bs.biz.mapper.account;

import com.bs.base.model.account.Authority;
import com.bs.base.model.PageCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xianyang on 2018/2/18.
 */
@Mapper
public interface AuthorityMapper {

    Authority create(Authority authority);

    Authority update(Authority authority);

    Authority delete(Authority authority);

    List<Authority> search(PageCondition condition);

}
