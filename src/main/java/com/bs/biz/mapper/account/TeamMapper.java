package com.bs.biz.mapper.account;

import com.bs.base.model.account.Team;
import com.bs.base.model.account.bo.TeamBo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by peter on 2018/3/16.
 */
@Mapper
public interface TeamMapper {

    Team findById(Long teamId);

    TeamBo findByUserName(String teamName);

    List<TeamBo> searchAll();

    Long deleteById(Long teamId);

}
