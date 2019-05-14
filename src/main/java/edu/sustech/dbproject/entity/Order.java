package edu.sustech.dbproject.entity;

import java.beans.JavaBean;
import java.util.Date;

public class Order {
    private int order_id;
    private int buyer_id;
    private int goods_id;
    private Date create_time;
    private int status;//0： 未完成； 1：已完成; -1: 已删除

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public int getStatus() {
        return status;
    }
}
