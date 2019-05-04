package edu.sustech.dbproject.entity;

import java.util.Date;

public class LogIn {
    private Integer info_id;
    private Integer user_id;
    private String session_key;
    private Date out_date;
    private String login_code;

    public Integer getInfo_id() {
        return info_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getSession_key() {
        return session_key;
    }

    public Date getOut_date() {
        return out_date;
    }

    public String getLogin_code() {
        return login_code;
    }
}
