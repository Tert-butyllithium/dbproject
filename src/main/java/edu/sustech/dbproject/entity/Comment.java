package edu.sustech.dbproject.entity;

import java.util.Date;

public class Comment {
    private Integer id;
    private Integer order_id;
    private Integer cmt_rate;
    private String cmt_desc_cn;
    private String cmt_desc_en;
    private Date cmt_time;

    public void setCmt_time(Date cmt_time) {
        this.cmt_time = cmt_time;
    }

    public Date getCmt_time() {
        return cmt_time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public void setCmt_rate(Integer cmt_rate) {
        this.cmt_rate = cmt_rate;
    }

    public void setCmt_desc_cn(String cmt_desc_cn) {
        this.cmt_desc_cn = cmt_desc_cn;
    }

    public void setCmt_desc_en(String cmt_desc_en) {
        this.cmt_desc_en = cmt_desc_en;
    }

    public Integer getId() {
        return id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public Integer getCmt_rate() {
        return cmt_rate;
    }

    public String getCmt_desc_cn() {
        return cmt_desc_cn;
    }

    public String getCmt_desc_en() {
        return cmt_desc_en;
    }

    @Override
    public String toString() {
        return cmt_desc_cn;
    }
}
