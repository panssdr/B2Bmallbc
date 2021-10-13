package com.usx.b2bmall.pojo;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
public class Receiptevidence implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer goodsReceiptID;

    private String url;

    private String descript;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsReceiptID() {
        return goodsReceiptID;
    }

    public void setGoodsReceiptID(Integer goodsReceiptID) {
        this.goodsReceiptID = goodsReceiptID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Override
    public String toString() {
        return "Receiptevidence{" +
        "id=" + id +
        ", goodsReceiptID=" + goodsReceiptID +
        ", url=" + url +
        ", descript=" + descript +
        "}";
    }
}
