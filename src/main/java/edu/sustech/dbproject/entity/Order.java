package edu.sustech.dbproject.entity;

import java.beans.JavaBean;
import java.util.Date;

public class Order {
    private Integer order_id;
    private Integer buyer_id;
    private Integer goods_id;
    private Date create_time;
    private Integer status;//0： 未完成； 1：已完成; -1: 已删除

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public void setBuyer_id(Integer buyer_id) {
        this.buyer_id = buyer_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public Integer getBuyer_id() {
        return buyer_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public Integer getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return Integer.toString(goods_id);
    }
}
