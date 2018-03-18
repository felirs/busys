package com.bs.biz.service.account;

import com.bs.base.model.account.Team;
import com.bs.base.model.account.bo.TeamBo;

import java.util.List;

/**
 * Created by xianyang on 2018/2/4.
 */
public interface TeamService {

    Team findById(Long teamId);

    TeamBo findByTeamName(String teamName);

    List<TeamBo> searchAll();

    void deleteById(Long teamId);
}
