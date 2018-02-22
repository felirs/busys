package com.bs.base.model.account.bo;

import com.bs.base.model.account.Team;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianyang on 2018/2/22.
 */
public class TeamBo extends Team {

    private static final long serialVersionUID = -7047319533588813518L;

    private List<UserBo> teamUsers = new ArrayList<>();

    public List<UserBo> getTeamUsers() {
        return teamUsers;
    }

    public void setTeamUsers(List<UserBo> teamUsers) {
        this.teamUsers = teamUsers;
    }
}
