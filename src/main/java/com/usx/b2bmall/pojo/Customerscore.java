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
public class Customerscore implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer customerID;

    private String orderID;

    private Integer score;

    private LocalDateTime inputDate;

    private String descript;


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

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Override
    public String toString() {
        return "Customerscore{" +
        "id=" + id +
        ", customerID=" + customerID +
        ", orderID=" + orderID +
        ", score=" + score +
        ", inputDate=" + inputDate +
        ", descript=" + descript +
        "}";
    }
}
