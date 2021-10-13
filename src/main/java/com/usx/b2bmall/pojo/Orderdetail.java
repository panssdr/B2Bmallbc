package com.usx.b2bmall.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderID;

    private Integer categoryID1;

    private Integer categoryID2;

    private Integer categoryID3;

    private String usePurpose;

    private Integer cardingTechID;

    private String ingredient;

    private String variety;

    private String equipment;

    private String fineTech;

    private String fabricStructure;

    private BigDecimal width;

    private Integer gramWeight;

    private Integer warpBranch;

    private Integer weftBranch;

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


    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getCategoryID1() {
        return categoryID1;
    }

    public void setCategoryID1(Integer categoryID1) {
        this.categoryID1 = categoryID1;
    }

    public Integer getCategoryID2() {
        return categoryID2;
    }

    public void setCategoryID2(Integer categoryID2) {
        this.categoryID2 = categoryID2;
    }

    public Integer getCategoryID3() {
        return categoryID3;
    }

    public void setCategoryID3(Integer categoryID3) {
        this.categoryID3 = categoryID3;
    }

    public String getUsePurpose() {
        return usePurpose;
    }

    public void setUsePurpose(String usePurpose) {
        this.usePurpose = usePurpose;
    }

    public Integer getCardingTechID() {
        return cardingTechID;
    }

    public void setCardingTechID(Integer cardingTechID) {
        this.cardingTechID = cardingTechID;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getFineTech() {
        return fineTech;
    }

    public void setFineTech(String fineTech) {
        this.fineTech = fineTech;
    }

    public String getFabricStructure() {
        return fabricStructure;
    }

    public void setFabricStructure(String fabricStructure) {
        this.fabricStructure = fabricStructure;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public Integer getGramWeight() {
        return gramWeight;
    }

    public void setGramWeight(Integer gramWeight) {
        this.gramWeight = gramWeight;
    }

    public Integer getWarpBranch() {
        return warpBranch;
    }

    public void setWarpBranch(Integer warpBranch) {
        this.warpBranch = warpBranch;
    }

    public Integer getWeftBranch() {
        return weftBranch;
    }

    public void setWeftBranch(Integer weftBranch) {
        this.weftBranch = weftBranch;
    }

    public Integer getWarpDensity() {
        return warpDensity;
    }

    public void setWarpDensity(Integer warpDensity) {
        this.warpDensity = warpDensity;
    }

    public Integer getWeftDensity() {
        return weftDensity;
    }

    public void setWeftDensity(Integer weftDensity) {
        this.weftDensity = weftDensity;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public Integer getBranchNum() {
        return branchNum;
    }

    public void setBranchNum(Integer branchNum) {
        this.branchNum = branchNum;
    }

    public Integer getStrandsNum() {
        return strandsNum;
    }

    public void setStrandsNum(Integer strandsNum) {
        this.strandsNum = strandsNum;
    }

    public String getFilamentSpec() {
        return filamentSpec;
    }

    public void setFilamentSpec(String filamentSpec) {
        this.filamentSpec = filamentSpec;
    }

    public Integer getYarnTechID() {
        return yarnTechID;
    }

    public void setYarnTechID(Integer yarnTechID) {
        this.yarnTechID = yarnTechID;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getWarpBranchUnit() {
        return warpBranchUnit;
    }

    public void setWarpBranchUnit(String warpBranchUnit) {
        this.warpBranchUnit = warpBranchUnit;
    }

    public String getWeftBranchUnit() {
        return weftBranchUnit;
    }

    public void setWeftBranchUnit(String weftBranchUnit) {
        this.weftBranchUnit = weftBranchUnit;
    }

    @Override
    public String toString() {
        return "Orderdetail{" +
        "orderID=" + orderID +
        ", categoryID1=" + categoryID1 +
        ", categoryID2=" + categoryID2 +
        ", categoryID3=" + categoryID3 +
        ", usePurpose=" + usePurpose +
        ", cardingTechID=" + cardingTechID +
        ", ingredient=" + ingredient +
        ", variety=" + variety +
        ", equipment=" + equipment +
        ", fineTech=" + fineTech +
        ", fabricStructure=" + fabricStructure +
        ", width=" + width +
        ", gramWeight=" + gramWeight +
        ", warpBranch=" + warpBranch +
        ", weftBranch=" + weftBranch +
        ", warpDensity=" + warpDensity +
        ", weftDensity=" + weftDensity +
        ", pattern=" + pattern +
        ", flowerColor=" + flowerColor +
        ", branchNum=" + branchNum +
        ", strandsNum=" + strandsNum +
        ", filamentSpec=" + filamentSpec +
        ", yarnTechID=" + yarnTechID +
        ", shape=" + shape +
        ", color=" + color +
        ", tag=" + tag +
        ", warpBranchUnit=" + warpBranchUnit +
        ", weftBranchUnit=" + weftBranchUnit +
        "}";
    }
}
