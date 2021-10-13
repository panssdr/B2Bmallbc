package com.usx.b2bmall.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
public class Merchantcert implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer merchantID;

    private String descript;

    private String url;

    private LocalDateTime inputDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    @Override
    public String toString() {
        return "Merchantcert{" +
        "id=" + id +
        ", merchantID=" + merchantID +
        ", descript=" + descript +
        ", url=" + url +
        ", inputDate=" + inputDate +
        "}";
    }
}
