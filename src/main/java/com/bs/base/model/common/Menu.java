package com.bs.base.model.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianyang on 2018/2/16.
 */
public class Menu extends BaseModel {

    private static final long serialVersionUID = -8502994838576349353L;

    //菜单编码
    private String menuNo;

    //文字
    private String text;

    //权限
    private String authorityNo;

    //图标
    private String icon;

    //菜单url
    private String url;

    //父亲菜单编码
    private String parent;

    private List<Menu> children = new ArrayList<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public String getAuthorityNo() {
        return authorityNo;
    }

    public void setAuthorityNo(String authorityNo) {
        this.authorityNo = authorityNo;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

}
