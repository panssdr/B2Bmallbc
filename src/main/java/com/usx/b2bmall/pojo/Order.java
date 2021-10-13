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
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderID;

    private String goodsName;

    private String specifications;

    private BigDecimal price;

    private BigDecimal amount;

    private String descript;

    private String unit;

    private Integer customerID;

    private Integer merchantID;

    private BigDecimal totalPrice;

    private BigDecimal commission;

    private BigDecimal earnestMoney;

    private BigDecimal amountPaid;

    private LocalDateTime createDate;

    private Integer staffID;

    private Integer status;

    private Integer demandID;

    private Integer supplyID;


    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getEarnestMoney() {
        return earnestMoney;
    }

    public void setEarnestMoney(BigDecimal earnestMoney) {
        this.earnestMoney = earnestMoney;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDemandID() {
        return demandID;
    }

    public void setDemandID(Integer demandID) {
        this.demandID = demandID;
    }

    public Integer getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Integer supplyID) {
        this.supplyID = supplyID;
    }

    @Override
    public String toString() {
        return "Order{" +
        "orderID=" + orderID +
        ", goodsName=" + goodsName +
        ", specifications=" + specifications +
        ", price=" + price +
        ", amount=" + amount +
        ", descript=" + descript +
        ", unit=" + unit +
        ", customerID=" + customerID +
        ", merchantID=" + merchantID +
        ", totalPrice=" + totalPrice +
        ", commission=" + commission +
        ", earnestMoney=" + earnestMoney +
        ", amountPaid=" + amountPaid +
        ", createDate=" + createDate +
        ", staffID=" + staffID +
        ", status=" + status +
        ", demandID=" + demandID +
        ", supplyID=" + supplyID +
        "}";
    }
}
