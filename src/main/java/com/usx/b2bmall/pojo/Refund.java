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
public class Refund implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private BigDecimal amount;

    private String descript;

    private Integer refundMethod;

    private LocalDateTime refundDate;

    private Integer accountantID;

    private LocalDateTime inputDate;

    private Integer status;

    private Integer merchantID;

    private LocalDateTime receivalDate;

    private BigDecimal receivalAmount;


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

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getRefundMethod() {
        return refundMethod;
    }

    public void setRefundMethod(Integer refundMethod) {
        this.refundMethod = refundMethod;
    }

    public LocalDateTime getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(LocalDateTime refundDate) {
        this.refundDate = refundDate;
    }

    public Integer getAccountantID() {
        return accountantID;
    }

    public void setAccountantID(Integer accountantID) {
        this.accountantID = accountantID;
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

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public LocalDateTime getReceivalDate() {
        return receivalDate;
    }

    public void setReceivalDate(LocalDateTime receivalDate) {
        this.receivalDate = receivalDate;
    }

    public BigDecimal getReceivalAmount() {
        return receivalAmount;
    }

    public void setReceivalAmount(BigDecimal receivalAmount) {
        this.receivalAmount = receivalAmount;
    }

    @Override
    public String toString() {
        return "Refund{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", amount=" + amount +
        ", descript=" + descript +
        ", refundMethod=" + refundMethod +
        ", refundDate=" + refundDate +
        ", accountantID=" + accountantID +
        ", inputDate=" + inputDate +
        ", status=" + status +
        ", merchantID=" + merchantID +
        ", receivalDate=" + receivalDate +
        ", receivalAmount=" + receivalAmount +
        "}";
    }
}
