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
public class Goodsreceipt implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private Integer goodsDeliverID;

    private BigDecimal amount;

    private String descript;

    private LocalDateTime receiptDate;

    private Integer customerAddressID;

    private Integer staffID;

    private LocalDateTime inputDate;

    private Integer customerID;

    private Integer status;


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

    public Integer getGoodsDeliverID() {
        return goodsDeliverID;
    }

    public void setGoodsDeliverID(Integer goodsDeliverID) {
        this.goodsDeliverID = goodsDeliverID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public LocalDateTime getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDateTime receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Integer getCustomerAddressID() {
        return customerAddressID;
    }

    public void setCustomerAddressID(Integer customerAddressID) {
        this.customerAddressID = customerAddressID;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Goodsreceipt{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", goodsDeliverID=" + goodsDeliverID +
        ", amount=" + amount +
        ", descript=" + descript +
        ", receiptDate=" + receiptDate +
        ", customerAddressID=" + customerAddressID +
        ", staffID=" + staffID +
        ", inputDate=" + inputDate +
        ", customerID=" + customerID +
        ", status=" + status +
        "}";
    }
}
