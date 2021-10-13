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
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private BigDecimal amount;

    private String descript;

    private Integer paymentMethod;

    private LocalDateTime paymentDate;

    private String inputer;

    private LocalDateTime inputDate;

    private Integer status;

    private BigDecimal receivalAmount;

    private LocalDateTime receivalDate;

    private Integer accountantID;


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

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getInputer() {
        return inputer;
    }

    public void setInputer(String inputer) {
        this.inputer = inputer;
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

    public BigDecimal getReceivalAmount() {
        return receivalAmount;
    }

    public void setReceivalAmount(BigDecimal receivalAmount) {
        this.receivalAmount = receivalAmount;
    }

    public LocalDateTime getReceivalDate() {
        return receivalDate;
    }

    public void setReceivalDate(LocalDateTime receivalDate) {
        this.receivalDate = receivalDate;
    }

    public Integer getAccountantID() {
        return accountantID;
    }

    public void setAccountantID(Integer accountantID) {
        this.accountantID = accountantID;
    }

    @Override
    public String toString() {
        return "Payment{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", amount=" + amount +
        ", descript=" + descript +
        ", paymentMethod=" + paymentMethod +
        ", paymentDate=" + paymentDate +
        ", inputer=" + inputer +
        ", inputDate=" + inputDate +
        ", status=" + status +
        ", receivalAmount=" + receivalAmount +
        ", receivalDate=" + receivalDate +
        ", accountantID=" + accountantID +
        "}";
    }
}
