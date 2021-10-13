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
public class Customercert implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer customerID;

    private String descript;

    private String url;

    private LocalDateTime inputDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
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
        return "Customercert{" +
        "id=" + id +
        ", customerID=" + customerID +
        ", descript=" + descript +
        ", url=" + url +
        ", inputDate=" + inputDate +
        "}";
    }
}
