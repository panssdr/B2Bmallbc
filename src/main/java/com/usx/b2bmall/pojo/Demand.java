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
 * @since 2021-10-14
 */

@Data
@ToString
public class Demand implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String goodsName;

    private String specifications;  //描述

    private String descript;

    private BigDecimal price; //期望价格

    private BigDecimal amount; //数量

    private String unit;

    private String type;  //类型

    private Integer categoryID1;

    private String usePurpose;

    private Integer customerID;

    private Integer supplyID;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime createDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private LocalDateTime expirationDate;

    private Integer staffID;

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

    private String warpBranchUnit;

    private String weftBranchUnit;


}
