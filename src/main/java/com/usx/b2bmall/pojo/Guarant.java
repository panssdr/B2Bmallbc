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
public class Guarant implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer customerID;

    private Integer guarantorID;

    private Integer creditLimit;

    private LocalDateTime inputDate;

    private String guarantDescript;

    private Integer auditorID;

    private Integer status;

    private String auditDescript;

    private LocalDateTime auditDate;


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

    public Integer getGuarantorID() {
        return guarantorID;
    }

    public void setGuarantorID(Integer guarantorID) {
        this.guarantorID = guarantorID;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public String getGuarantDescript() {
        return guarantDescript;
    }

    public void setGuarantDescript(String guarantDescript) {
        this.guarantDescript = guarantDescript;
    }

    public Integer getAuditorID() {
        return auditorID;
    }

    public void setAuditorID(Integer auditorID) {
        this.auditorID = auditorID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuditDescript() {
        return auditDescript;
    }

    public void setAuditDescript(String auditDescript) {
        this.auditDescript = auditDescript;
    }

    public LocalDateTime getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDateTime auditDate) {
        this.auditDate = auditDate;
    }

    @Override
    public String toString() {
        return "Guarant{" +
        "id=" + id +
        ", customerID=" + customerID +
        ", guarantorID=" + guarantorID +
        ", creditLimit=" + creditLimit +
        ", inputDate=" + inputDate +
        ", guarantDescript=" + guarantDescript +
        ", auditorID=" + auditorID +
        ", status=" + status +
        ", auditDescript=" + auditDescript +
        ", auditDate=" + auditDate +
        "}";
    }
}
