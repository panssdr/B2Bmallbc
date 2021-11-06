package com.usx.b2bmall.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InquirysheetDemand implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer demandID;  //需求id
    private String goodsName; //需求名称
    private String specifications; //需求规格
    private String category; //需求类别
    private BigDecimal price; //期望价格
    private BigDecimal amount;//需求数量
    private String descript; //详情
    private BigDecimal guidePrice; //指导价格
    private Integer customerID; //顾客ID
    private Integer staffID;  //客服ID
    private String analysisDescript; //技术分析
    private Integer technicianID;
    private BigDecimal quotedPrice;
    private Integer merchantID;
    private Integer qcID;
    private Integer status;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime analysisDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime quotedDate;


}
