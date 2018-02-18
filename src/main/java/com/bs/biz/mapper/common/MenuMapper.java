package com.bs.biz.mapper.common;

import com.bs.base.model.common.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xianyang on 2018/2/16.
 */
@Mapper
public interface MenuMapper {

    List<Menu> findByParent(String parent);

}
