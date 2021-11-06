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
public class Inquirysheet implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer demandID;
    private BigDecimal guidePrice;
    private Integer customerID; //顾客ID
    private Integer staffID;  //客服ID
    private String analysisDescript;
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
