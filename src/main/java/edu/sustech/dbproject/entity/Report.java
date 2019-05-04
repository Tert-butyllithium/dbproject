package edu.sustech.dbproject.entity;

public class Report {
    private Integer id;
    private Integer goods_id;
    private Integer reporter_id;
    private String report_desc_cn;
    private String report_desc_en;
    private String report_fdb_cn;
    private String report_fdb_en;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public void setReporter_id(Integer reporter_id) {
        this.reporter_id = reporter_id;
    }

    public void setReport_desc_cn(String report_desc_cn) {
        this.report_desc_cn = report_desc_cn;
    }

    public void setReport_desc_en(String report_desc_en) {
        this.report_desc_en = report_desc_en;
    }

    public void setReport_fdb_cn(String report_fdb_cn) {
        this.report_fdb_cn = report_fdb_cn;
    }

    public void setReport_fdb_en(String report_fdb_en) {
        this.report_fdb_en = report_fdb_en;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public Integer getReporter_id() {
        return reporter_id;
    }

    public String getReport_desc_cn() {
        return report_desc_cn;
    }

    public String getReport_desc_en() {
        return report_desc_en;
    }

    public String getReport_fdb_cn() {
        return report_fdb_cn;
    }

    public String getReport_fdb_en() {
        return report_fdb_en;
    }
}
