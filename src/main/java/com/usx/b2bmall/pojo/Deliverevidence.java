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
public class Deliverevidence implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer goodsDeliverID;

    private String url;

    private String descript;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsDeliverID() {
        return goodsDeliverID;
    }

    public void setGoodsDeliverID(Integer goodsDeliverID) {
        this.goodsDeliverID = goodsDeliverID;
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
        return "Deliverevidence{" +
        "id=" + id +
        ", goodsDeliverID=" + goodsDeliverID +
        ", url=" + url +
        ", descript=" + descript +
        "}";
    }
}
