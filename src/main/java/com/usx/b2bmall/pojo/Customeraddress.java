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
public class Customeraddress implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer customerID;

    private String consignee;

    private String phone;

    private String telephone;

    private String deliveryAddress;

    private LocalDateTime inputDate;

    private Integer isSelected;


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

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return "Customeraddress{" +
        "id=" + id +
        ", customerID=" + customerID +
        ", consignee=" + consignee +
        ", phone=" + phone +
        ", telephone=" + telephone +
        ", deliveryAddress=" + deliveryAddress +
        ", inputDate=" + inputDate +
        ", isSelected=" + isSelected +
        "}";
    }
}
