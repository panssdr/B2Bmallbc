package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Demandsupply;
import com.usx.b2bmall.pojo.Supply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
@Mapper
public interface SupplyMapper extends BaseMapper<Supply> {

    @Select("SELECT ID id,GoodsName goodsName,Specifications specifications,\n" +
            "                      CreateDate createDate,\n" +
            "                       CONCAT_WS(\"/\",Price,Unit) as priceAndAmount,\n" +
            "                        CONCAT_WS(\"/\",MOQ,Unit) as moq,\n" +
            "                        isSpotGoods isSpotGoods,\n" +
            "                         (SELECT merchant.`CoName` FROM merchant where  supply.MerchantID=merchant.ID )as supplyCompany,\n" +
            "                       (SELECT category.`Name` FROM category where supply.CategoryID1=category.ID )as type from supply")
    List<Supply> getAll();

    @Select("SELECT ID id,GoodsName goodsName,Specifications specifications,\n" +
            "                      CreateDate createDate,\n" +
            "                       CONCAT_WS(\"/\",Price,Unit) as priceAndAmount,\n" +
            "                        CONCAT_WS(\"/\",MOQ,Unit) as moq,\n" +
            "                        isSpotGoods isSpotGoods,\n" +
            "                         (SELECT merchant.`CoName` FROM merchant where  supply.MerchantID=merchant.ID )as supplyCompany,\n" +
            "                       (SELECT category.`Name` FROM category where supply.CategoryID1=category.ID )as type from supply limit 5" )
    List<Supply> getHomeSupply();




}
