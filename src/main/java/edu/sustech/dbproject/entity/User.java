package edu.sustech.dbproject.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private Integer user_id;
    private Integer status;
    private Integer permission;
    private String nickname;
    private String email_address;//邮箱地址
    private String avatar_url;
    private Integer open_id;

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getPermission() {
        return permission;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail_address() {
        return email_address;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public Integer getOpen_id() {
        return open_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setOpen_id(Integer open_id) {
        this.open_id = open_id;
    }

    @Override
    public String toString() {
        return "[id="+user_id+", nickname="+nickname+", email address="+email_address+"]";
    }

    /*
    这些内容到时候直接用sql语句生成吧
    List<Long> buyList;//买入，订单号
    List<Long> sellList;//卖出，订单号
    List<Long> releaseList;//已发布，未卖出，商品号
    List<Long> markedList;//收藏夹，商品号

 */

}
