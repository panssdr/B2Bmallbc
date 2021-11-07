package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Order;
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
public interface OrderMapper extends BaseMapper<Order> {

    @Select("select OrderID,DemandID,CustomerID,GoodsName,Specifications,Descript,Price," +
            "Amount,Unit,MerchantID,CreateDate,`Status` from `order`")
    List<Order> getAll();

    @Select("select * from `order` where OrderID = #{id}")
    Order getOne(String id);
}
