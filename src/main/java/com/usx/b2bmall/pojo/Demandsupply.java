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
public class Demandsupply implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String goodsName; //商品名称
    private BigDecimal price; //价格
    private BigDecimal amount;//数量
    private Integer categoryID1;//需求
    private String category; //需求类别
    private String specifications; //需求规格
    private String descript; //商品描述
    private Integer inquirySheetID;
    private String usePurpose;//用途

    private Integer demandID;

    private Integer merchantID;

    private Integer supplyID;

    private BigDecimal quotedPrice;

    private String quotedDescript;

    private Integer technicianID;

    private String auditDescript;

    private Integer status;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime quotedDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime auditDate;

    private Integer isSelected;


}
