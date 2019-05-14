package edu.sustech.dbproject.entity;

import java.util.Date;
import java.util.List;

public class Good {
    private Integer goods_id;
    private Integer seller_id;
    private String name;
    private Integer goods_tag;
    private String trade_loc;
    private String desc_cn,desc_en;
    private Date post_time;
    private Integer goods_status;// 1: normal, 2: sold, 3: private
    private Double price;// or double ?
    private Double buying_price;

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setSeller_id(Integer seller_id) {
        this.seller_id = seller_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoods_tag(Integer goods_tag) {
        this.goods_tag = goods_tag;
    }

    public void setTrade_loc(String trade_loc) {
        this.trade_loc = trade_loc;
    }

    public void setDesc_cn(String desc_cn) {
        this.desc_cn = desc_cn;
    }

    public void setDesc_en(String desc_en) {
        this.desc_en = desc_en;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    public void setGoods_status(Integer goods_status) {
        this.goods_status = goods_status;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBuying_Price(Double buying_price) {
        this.buying_price = buying_price;
    }

    public Integer getSeller_id() {
        return seller_id;
    }

    public String getName() {
        return name;
    }

    public Integer getGoods_tag() {
        return goods_tag;
    }

    public String getTrade_loc() {
        return trade_loc;
    }

    public String getDesc_cn() {
        return desc_cn;
    }

    public String getDesc_en() {
        return desc_en;
    }

    public Date getPost_time() {
        return post_time;
    }

    public Integer getGoods_status() {
        return goods_status;
    }

    public Double getPrice() {
        return price;
    }

    public Double getBuying_price() {
        return buying_price;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
