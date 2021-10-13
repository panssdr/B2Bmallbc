package com.usx.b2bmall.pojo;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer merchantID;

    private String name;

    private String phone;

    private String email;

    private String telephone;

    private String position;

    private String qq;

    private String wechatNum;

    private String contactAddress;

    private Integer isSelected;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return "Contact{" +
        "id=" + id +
        ", merchantID=" + merchantID +
        ", name=" + name +
        ", phone=" + phone +
        ", email=" + email +
        ", telephone=" + telephone +
        ", position=" + position +
        ", qq=" + qq +
        ", wechatNum=" + wechatNum +
        ", contactAddress=" + contactAddress +
        ", isSelected=" + isSelected +
        "}";
    }
}
