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
public class Productorderlog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private Integer staffID;

    private Integer customerID;

    private String statusDescript;

    private String descript;

    private LocalDateTime createDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getStatusDescript() {
        return statusDescript;
    }

    public void setStatusDescript(String statusDescript) {
        this.statusDescript = statusDescript;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Productorderlog{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", staffID=" + staffID +
        ", customerID=" + customerID +
        ", statusDescript=" + statusDescript +
        ", descript=" + descript +
        ", createDate=" + createDate +
        "}";
    }
}
