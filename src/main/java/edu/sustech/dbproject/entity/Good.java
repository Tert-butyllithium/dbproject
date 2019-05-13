package edu.sustech.dbproject.entity;

import java.util.Date;
import java.util.List;

public class Good {
    private Integer goodId;
    private Integer seller;
    private String name;
    private Integer tag;
    private String tradeLocation;
    private String desc_cn,desc_en;
    private Date postTime;
    private Integer status;// 1: normal, 2: sold, 3: private
    private Double price;// or double ?
    private Double oldPrice;

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public void setTradeLocation(String tradeLocation) {
        this.tradeLocation = tradeLocation;
    }

    public void setDesc_cn(String desc_cn) {
        this.desc_cn = desc_cn;
    }

    public void setDesc_en(String desc_en) {
        this.desc_en = desc_en;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public Integer getSeller() {
        return seller;
    }

    public Integer getTag() {
        return tag;
    }

    public String getTradeLocation() {
        return tradeLocation;
    }

    public String getDesc_cn() {
        return desc_cn;
    }

    public String getDesc_en() {
        return desc_en;
    }

    public Date getPostTime() {
        return postTime;
    }

    public Integer getStatus() {
        return status;
    }

    public Double getPrice() {
        return price;
    }

    public Double getOldPrice() {
        return oldPrice;
    }
}
