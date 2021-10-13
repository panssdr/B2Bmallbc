package com.usx.b2bmall.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
public class Productorderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private Integer supplyID;

    private BigDecimal amount;

    private BigDecimal unitPrice;

    private BigDecimal tranPrice;

    private BigDecimal totalPrice;


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

    public Integer getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Integer supplyID) {
        this.supplyID = supplyID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTranPrice() {
        return tranPrice;
    }

    public void setTranPrice(BigDecimal tranPrice) {
        this.tranPrice = tranPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Productorderdetail{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", supplyID=" + supplyID +
        ", amount=" + amount +
        ", unitPrice=" + unitPrice +
        ", tranPrice=" + tranPrice +
        ", totalPrice=" + totalPrice +
        "}";
    }
}
