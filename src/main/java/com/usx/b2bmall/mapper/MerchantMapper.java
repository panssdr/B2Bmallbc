package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Merchant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.usx.b2bmall.pojo.Merchantcert;
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
public interface MerchantMapper extends BaseMapper<Merchant> {

    @Select("SELECT * from merchant")
    List<Merchant> merchantFindAll();
}
