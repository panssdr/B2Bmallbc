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
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer staffID;

    private String name;

    private String gender;

    private LocalDateTime dateOfBirth;

    private LocalDateTime entryDate;

    private LocalDateTime leaveDate;

    private String telephone;

    private String address;

    private String phone;

    private Integer departmentID;

    private String password;

    private LocalDateTime loginDate;

    private Integer loginCount;

    private Integer roleID;


    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDateTime leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDateTime loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    @Override
    public String toString() {
        return "Staff{" +
        "staffID=" + staffID +
        ", name=" + name +
        ", gender=" + gender +
        ", dateOfBirth=" + dateOfBirth +
        ", entryDate=" + entryDate +
        ", leaveDate=" + leaveDate +
        ", telephone=" + telephone +
        ", address=" + address +
        ", phone=" + phone +
        ", departmentID=" + departmentID +
        ", password=" + password +
        ", loginDate=" + loginDate +
        ", loginCount=" + loginCount +
        ", roleID=" + roleID +
        "}";
    }
}
