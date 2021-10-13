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
public class Inquirysheet implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer demandID;

    private BigDecimal guidePrice;

    private String analysisDescript;

    private Integer technicianID;

    private BigDecimal quotedPrice;

    private Integer merchantID;

    private Integer qcID;

    private Integer status;

    private LocalDateTime createDate;

    private LocalDateTime analysisDate;

    private LocalDateTime quotedDate;


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

    public BigDecimal getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(BigDecimal guidePrice) {
        this.guidePrice = guidePrice;
    }

    public String getAnalysisDescript() {
        return analysisDescript;
    }

    public void setAnalysisDescript(String analysisDescript) {
        this.analysisDescript = analysisDescript;
    }

    public Integer getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(Integer technicianID) {
        this.technicianID = technicianID;
    }

    public BigDecimal getQuotedPrice() {
        return quotedPrice;
    }

    public void setQuotedPrice(BigDecimal quotedPrice) {
        this.quotedPrice = quotedPrice;
    }

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public Integer getQcID() {
        return qcID;
    }

    public void setQcID(Integer qcID) {
        this.qcID = qcID;
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

    public LocalDateTime getAnalysisDate() {
        return analysisDate;
    }

    public void setAnalysisDate(LocalDateTime analysisDate) {
        this.analysisDate = analysisDate;
    }

    public LocalDateTime getQuotedDate() {
        return quotedDate;
    }

    public void setQuotedDate(LocalDateTime quotedDate) {
        this.quotedDate = quotedDate;
    }

    @Override
    public String toString() {
        return "Inquirysheet{" +
        "id=" + id +
        ", demandID=" + demandID +
        ", guidePrice=" + guidePrice +
        ", analysisDescript=" + analysisDescript +
        ", technicianID=" + technicianID +
        ", quotedPrice=" + quotedPrice +
        ", merchantID=" + merchantID +
        ", qcID=" + qcID +
        ", status=" + status +
        ", createDate=" + createDate +
        ", analysisDate=" + analysisDate +
        ", quotedDate=" + quotedDate +
        "}";
    }
}
