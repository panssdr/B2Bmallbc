package com.usx.b2bmall.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

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
public class Demandintent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String phone;

    private String name;

    private String contactName; //联系人姓名

    private String demandDescript;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime createDate;

    private String ipAddress;

    private String url1;

    private String url2;

    private String url3;

    private String telePhone;

    private String qq;

    private String wechatNum;

    private Integer staffID;

    private Integer status;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime lockDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDemandDescript() {
        return demandDescript;
    }

    public void setDemandDescript(String demandDescript) {
        this.demandDescript = demandDescript;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
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

    public LocalDateTime getLockDate() {
        return lockDate;
    }

    public void setLockDate(LocalDateTime lockDate) {
        this.lockDate = lockDate;
    }

    @Override
    public String toString() {
        return "Demandintent{" +
        "id=" + id +
        ", phone=" + phone +
        ", name=" + name +
        ", contactName=" + contactName +
        ", demandDescript=" + demandDescript +
        ", createDate=" + createDate +
        ", ipAddress=" + ipAddress +
        ", url1=" + url1 +
        ", url2=" + url2 +
        ", url3=" + url3 +
        ", telePhone=" + telePhone +
        ", qq=" + qq +
        ", wechatNum=" + wechatNum +
        ", staffID=" + staffID +
        ", status=" + status +
        ", lockDate=" + lockDate +
        "}";
    }
}
