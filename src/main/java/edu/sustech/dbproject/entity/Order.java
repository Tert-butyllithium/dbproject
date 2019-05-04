package edu.sustech.dbproject.entity;

import java.beans.JavaBean;
import java.util.Date;

public class Order {
    private final int orderId;
    private int buyer;
    private int good;
    private Date createTime;
    private int status;

    public int getOrderId() {
        return orderId;
    }

    public int getBuyer() {
        return buyer;
    }

    public int getGood() {
        return good;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Order(int orderId) {
        this.orderId = orderId;
    }
}
