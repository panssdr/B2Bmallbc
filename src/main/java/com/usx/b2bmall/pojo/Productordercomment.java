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
public class Productordercomment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String orderID;

    private Integer supplyID;

    private Integer qualityScore;

    private Integer serviceScore;

    private Integer logisticsScore;

    private Integer staffID;

    private String content;

    private String reply;

    private LocalDateTime createDate;

    private LocalDateTime replyDate;

    private Integer customerScore;


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

    public Integer getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Integer getLogisticsScore() {
        return logisticsScore;
    }

    public void setLogisticsScore(Integer logisticsScore) {
        this.logisticsScore = logisticsScore;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(LocalDateTime replyDate) {
        this.replyDate = replyDate;
    }

    public Integer getCustomerScore() {
        return customerScore;
    }

    public void setCustomerScore(Integer customerScore) {
        this.customerScore = customerScore;
    }

    @Override
    public String toString() {
        return "Productordercomment{" +
        "id=" + id +
        ", orderID=" + orderID +
        ", supplyID=" + supplyID +
        ", qualityScore=" + qualityScore +
        ", serviceScore=" + serviceScore +
        ", logisticsScore=" + logisticsScore +
        ", staffID=" + staffID +
        ", content=" + content +
        ", reply=" + reply +
        ", createDate=" + createDate +
        ", replyDate=" + replyDate +
        ", customerScore=" + customerScore +
        "}";
    }
}
