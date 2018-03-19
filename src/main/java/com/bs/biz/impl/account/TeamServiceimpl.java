package com.bs.biz.impl.account;

import com.bs.base.model.account.Team;
import com.bs.base.model.account.bo.TeamBo;
import com.bs.biz.mapper.account.TeamMapper;
import com.bs.biz.service.account.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by peter on 2018/2/4.
 */
@Service
public class TeamServiceimpl implements TeamService{

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public Team findById(Long teamId) {
        return teamMapper.findById(teamId);
    }

    @Override
    public TeamBo findByTeamName(String teamName) {
        return null;
    }

    @Override
    public List<TeamBo> searchAll() {
        return null;
    }

    @Override
    public void deleteById(Long teamId) {

    }

    @Override
    public TeamBo findByUserName(String teamName) {
        return teamMapper.findByUserName(teamName);
    }
}
