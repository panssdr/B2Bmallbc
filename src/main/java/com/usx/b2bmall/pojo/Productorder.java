package com.usx.b2bmall.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
public class Productorder implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderID;

    private Integer customerID;

    private LocalDateTime createDate;

    private BigDecimal totalPrice;

    private String descript;

    private Integer status;


    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Productorder{" +
        "orderID=" + orderID +
        ", customerID=" + customerID +
        ", createDate=" + createDate +
        ", totalPrice=" + totalPrice +
        ", descript=" + descript +
        ", status=" + status +
        "}";
    }
}
