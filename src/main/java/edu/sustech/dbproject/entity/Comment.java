package edu.sustech.dbproject.entity;

public class Comment {
    private Integer id;
    private Integer order_id;
    private Integer cmt_rate;
    private String cmt_desc_cn;
    private String cmt_desc_en;

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
}
