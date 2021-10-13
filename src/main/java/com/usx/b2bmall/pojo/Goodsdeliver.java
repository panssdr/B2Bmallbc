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
public class Goodsdeliver implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private BigDecimal amount;

    private Integer deliveryBatch;

    private String descript;

    private LocalDateTime deliverDate;

    private String consignor;

    private String phone;

    private String deliverAddress;

    private Integer customerAddressID;

    private Integer staffID;

    private LocalDateTime inputDate;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getDeliveryBatch() {
        return deliveryBatch;
    }

    public void setDeliveryBatch(Integer deliveryBatch) {
        this.deliveryBatch = deliveryBatch;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public LocalDateTime getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(LocalDateTime deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getConsignor() {
        return consignor;
    }

    public void setConsignor(String consignor) {
        this.consignor = consignor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Goodsdeliver{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", amount=" + amount +
        ", deliveryBatch=" + deliveryBatch +
        ", descript=" + descript +
        ", deliverDate=" + deliverDate +
        ", consignor=" + consignor +
        ", phone=" + phone +
        ", deliverAddress=" + deliverAddress +
        ", customerAddressID=" + customerAddressID +
        ", staffID=" + staffID +
        ", inputDate=" + inputDate +
        ", status=" + status +
        "}";
    }
}
