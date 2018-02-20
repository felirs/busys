package com.bs.web.config.security;

import com.bs.base.model.account.bo.UserBo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by xianyang on 2018/2/20.
 */
public class BsUserDetails implements UserDetails {

    private static final long serialVersionUID = 2643574640989500016L;

    private final Long userId;

    private final String userName;

    private final String userCode;

    private final String password;

    private final String realName;

    private final String roles;

    private final String authNos;

    private final Boolean locked;

    private final Boolean enabled;

    private Collection<GrantedAuthority> authorities;

    public BsUserDetails(UserBo userBo){
        this.userId = userBo.getId();
        this.userName = userBo.getUserName();
        this.userCode = userBo.getUserCode();
        this.realName = userBo.getRealName();
        this.password = userBo.getPassword();
        this.roles = userBo.getRoles();
        this.authNos = userBo.getAuthNos();
        this.locked = userBo.getLocked();
        this.enabled = userBo.getEnabled();
        if(!StringUtils.isEmpty(authNos)){
            this.authorities = Collections.unmodifiableCollection(AuthorityUtils.
                    commaSeparatedStringToAuthorityList(authNos));
        }else{
            this.authorities = new ArrayList<>();
        }
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getRealName() {
        return realName;
    }

    public String getRoles() {
        return roles;
    }

    public String getAuthNos() {
        return authNos;
    }

    public Boolean getLocked() {
        return locked;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !this.locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
