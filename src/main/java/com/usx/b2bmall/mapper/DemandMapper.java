package com.usx.b2bmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.usx.b2bmall.pojo.Demand;
import org.apache.ibatis.annotations.Insert;
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

    @Select("SELECT ID id,GoodsName goodsName,Specifications specifications, \n" +
            "            Amount amount,CreateDate createDate,\n" +
            "            CONCAT_WS(\"/\",Price,Unit) as priceAndAmount,\n" +
            "            (SELECT category.`Name` FROM category where demand.CategoryID1= category.ID )as type from demand LIMIT 5")
    List<Demand> getHomeDemand();


    @Insert("INSERT INTO demand(GoodsName,Specifications,Descript,Price,Amount,Unit," +
            "CategoryID1,UsePurpose,CreateDate,StaffID,Width,Ingredient,Status,CustomerID) " +
            "values(#{goodsName},#{specifications},#{descript},#{price}," +
            "#{amount},#{unit},#{categoryID1},#{usePurpose},#{createDate},#{staffID},#{width}," +
            "#{ingredient},#{status},#{customerID})")
    public Boolean createTableByCustomerService(Demand demand);
}