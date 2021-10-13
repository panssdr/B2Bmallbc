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
public class Merchant implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String accountCode;

    private String passWord;

    private String coName;

    private String englishName;

    private String province;

    private String city;

    private String coAddress;

    private String coTelephone;

    private String coFax;

    private String enterpriseScale;

    private String mainProduct;

    private Integer rank;

    private Integer score;

    private String recommendation;

    private String name;

    private String phone;

    private String email;

    private String telephone;

    private String position;

    private String qq;

    private String wechatNum;

    private String contactAddress;

    private LocalDateTime registerDate;

    private LocalDateTime loginDate;

    private Integer loginCount;

    private Integer registerType;

    private Integer auditorID;

    private LocalDateTime auditDate;

    private Integer status;

    private Integer isInvestigated;

    private Integer isIndividual;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoAddress() {
        return coAddress;
    }

    public void setCoAddress(String coAddress) {
        this.coAddress = coAddress;
    }

    public String getCoTelephone() {
        return coTelephone;
    }

    public void setCoTelephone(String coTelephone) {
        this.coTelephone = coTelephone;
    }

    public String getCoFax() {
        return coFax;
    }

    public void setCoFax(String coFax) {
        this.coFax = coFax;
    }

    public String getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(String enterpriseScale) {
        this.enterpriseScale = enterpriseScale;
    }

    public String getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
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

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
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

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public Integer getAuditorID() {
        return auditorID;
    }

    public void setAuditorID(Integer auditorID) {
        this.auditorID = auditorID;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsInvestigated() {
        return isInvestigated;
    }

    public void setIsInvestigated(Integer isInvestigated) {
        this.isInvestigated = isInvestigated;
    }

    public Integer getIsIndividual() {
        return isIndividual;
    }

    public void setIsIndividual(Integer isIndividual) {
        this.isIndividual = isIndividual;
    }

    @Override
    public String toString() {
        return "Merchant{" +
        "id=" + id +
        ", accountCode=" + accountCode +
        ", passWord=" + passWord +
        ", coName=" + coName +
        ", englishName=" + englishName +
        ", province=" + province +
        ", city=" + city +
        ", coAddress=" + coAddress +
        ", coTelephone=" + coTelephone +
        ", coFax=" + coFax +
        ", enterpriseScale=" + enterpriseScale +
        ", mainProduct=" + mainProduct +
        ", rank=" + rank +
        ", score=" + score +
        ", recommendation=" + recommendation +
        ", name=" + name +
        ", phone=" + phone +
        ", email=" + email +
        ", telephone=" + telephone +
        ", position=" + position +
        ", qq=" + qq +
        ", wechatNum=" + wechatNum +
        ", contactAddress=" + contactAddress +
        ", registerDate=" + registerDate +
        ", loginDate=" + loginDate +
        ", loginCount=" + loginCount +
        ", registerType=" + registerType +
        ", auditorID=" + auditorID +
        ", auditDate=" + auditDate +
        ", status=" + status +
        ", isInvestigated=" + isInvestigated +
        ", isIndividual=" + isIndividual +
        "}";
    }
}
