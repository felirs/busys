package com.bs.base.model.account;

import com.bs.base.model.common.BaseModel;

/**
 * Created by xianyang on 2018/2/22.
 */
public class Team extends BaseModel{

    private static final long serialVersionUID = 9081050524622287273L;

    //团队编码
    private String teamCode;

    //团队名称
    private String teamName;

    //是否启用
    private Boolean enabled;

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
