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
public class Merchantquotedprice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer demandID;

    private Integer merchantID;

    private Integer supplyID;

    private BigDecimal quotedPrice;

    private String quotedDescript;

    private Integer technicianID;

    private String auditDescript;

    private Integer status;

    private LocalDateTime createDate;

    private LocalDateTime quotedDate;

    private LocalDateTime auditDate;

    private Integer isSelected;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDemandID() {
        return demandID;
    }

    public void setDemandID(Integer demandID) {
        this.demandID = demandID;
    }

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public Integer getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Integer supplyID) {
        this.supplyID = supplyID;
    }

    public BigDecimal getQuotedPrice() {
        return quotedPrice;
    }

    public void setQuotedPrice(BigDecimal quotedPrice) {
        this.quotedPrice = quotedPrice;
    }

    public String getQuotedDescript() {
        return quotedDescript;
    }

    public void setQuotedDescript(String quotedDescript) {
        this.quotedDescript = quotedDescript;
    }

    public Integer getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(Integer technicianID) {
        this.technicianID = technicianID;
    }

    public String getAuditDescript() {
        return auditDescript;
    }

    public void setAuditDescript(String auditDescript) {
        this.auditDescript = auditDescript;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getQuotedDate() {
        return quotedDate;
    }

    public void setQuotedDate(LocalDateTime quotedDate) {
        this.quotedDate = quotedDate;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Integer isSelected) {
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return "Merchantquotedprice{" +
        "id=" + id +
        ", demandID=" + demandID +
        ", merchantID=" + merchantID +
        ", supplyID=" + supplyID +
        ", quotedPrice=" + quotedPrice +
        ", quotedDescript=" + quotedDescript +
        ", technicianID=" + technicianID +
        ", auditDescript=" + auditDescript +
        ", status=" + status +
        ", createDate=" + createDate +
        ", quotedDate=" + quotedDate +
        ", auditDate=" + auditDate +
        ", isSelected=" + isSelected +
        "}";
    }
}
