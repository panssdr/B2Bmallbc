package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Payment;
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
public interface PaymentMapper extends BaseMapper<Payment> {

    @Select("select * from payment")
    List<Payment> getAll();
}
