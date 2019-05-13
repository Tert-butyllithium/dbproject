package edu.sustech.dbproject.entity;

import java.util.Date;

public class Message {
    //主键ID
    private Integer chat_id;
    //发送者ID
    private Integer buyer_id;
    //商品ID
    private Integer goods_id;
    //时间
    private Date send_time;
    //内容
    private String chat_content;
    //内容类型
    private Integer chat_type;
    //direction
    private boolean chat_direct;

    public Integer getChat_id() {
        return chat_id;
    }

    public Integer getBuyer_id() {
        return buyer_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public Date getSend_time() {
        return send_time;
    }

    public String getChat_content() {
        return chat_content;
    }

    public Integer getChat_type() {
        return chat_type;
    }

    public boolean isChat_direct() {
        return chat_direct;
    }

    public void setChat_id(Integer chat_id) {
        this.chat_id = chat_id;
    }

    public void setBuyer_id(Integer buyer_id) {
        this.buyer_id = buyer_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public void setSend_time(Date send_time) {
        this.send_time = send_time;
    }

    public void setChat_content(String chat_content) {
        this.chat_content = chat_content;
    }

    public void setChat_type(Integer chat_type) {
        this.chat_type = chat_type;
    }

    public void setChat_direct(boolean chat_direct) {
        this.chat_direct = chat_direct;
    }
}

