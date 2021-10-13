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
public class Refundevidence implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer refundID;

    private String url;

    private String descript;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefundID() {
        return refundID;
    }

    public void setRefundID(Integer refundID) {
        this.refundID = refundID;
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
        return "Refundevidence{" +
        "id=" + id +
        ", refundID=" + refundID +
        ", url=" + url +
        ", descript=" + descript +
        "}";
    }
}
