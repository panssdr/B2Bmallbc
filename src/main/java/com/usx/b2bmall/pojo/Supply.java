package com.usx.b2bmall.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
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
public class Supply implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String goodsName;

    private String specifications;

    private String descript;

    private BigDecimal price;

    private BigDecimal amount;

    private String unit;

    private  String priceAndAmount;//单价

    private String  supplyCompany; //供货的公司

    private String type;//类型

    private Integer categoryID1;

    private Integer categoryID2;

    private Integer categoryID3;

    private String usePurpose;

    private Integer isHot;

    private String moq;//最小订单

    private Integer isSpotGoods;

    private String deliveryDate;

    private Integer isSample;

    private Integer isSpecialOffer;

    private Integer merchantID;

    private Integer demandID;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime createDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime expirationDate;

    private Integer status;

    private Integer cardingTechID;

    private String ingredient;

    private String variety;

    private String equipment;

    private String fineTech;

    private String fabricStructure;

    private BigDecimal width;

    private Integer gramWeight;

    private String warpBranch;

    private String weftBranch;

    private Integer warpDensity;

    private Integer weftDensity;

    private String pattern;

    private String flowerColor;

    private Integer branchNum;

    private Integer strandsNum;

    private String filamentSpec;

    private Integer yarnTechID;

    private String shape;

    private String color;

    private String tag;

    private Integer revisorID;

    private LocalDateTime reviseDate;

    private String warpBranchUnit;

    private String weftBranchUnit;

    private BigDecimal sampleAmount;

    private BigDecimal samplePrice;

    private String sampleDescript;



}
