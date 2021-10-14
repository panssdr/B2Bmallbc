package com.usx.b2bmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.usx.b2bmall.pojo.Demand;
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
public interface DemandMapper extends BaseMapper<Demand> {


    @Select("SELECT ID id,GoodsName goodsName,Specifications specifications, \n" +
            "            Amount amount,CreateDate createDate,\n" +
            "            CONCAT_WS(\"/\",Price,Unit) as priceAndAmount,\n" +
            "            (SELECT category.`Name` FROM category where demand.CategoryID1= category.ID )as type from demand")
     List<Demand> getAll();
}