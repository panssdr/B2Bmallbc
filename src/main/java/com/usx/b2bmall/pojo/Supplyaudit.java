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
public class Supplyaudit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer supplyID;

    private Integer technicianID;

    private Integer auditStatus;

    private String descript;

    private LocalDateTime auditDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Integer supplyID) {
        this.supplyID = supplyID;
    }

    public Integer getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(Integer technicianID) {
        this.technicianID = technicianID;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    @Override
    public String toString() {
        return "Supplyaudit{" +
        "id=" + id +
        ", supplyID=" + supplyID +
        ", technicianID=" + technicianID +
        ", auditStatus=" + auditStatus +
        ", descript=" + descript +
        ", auditDate=" + auditDate +
        "}";
    }
}
