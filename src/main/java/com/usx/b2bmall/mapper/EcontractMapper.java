package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Econtract;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
@Mapper
public interface EcontractMapper extends BaseMapper<Econtract> {

    @Select("select ID,Content,Descript from econtract")
    Econtract getOne(Integer id);
}
