package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Demandintent;
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
public interface DemandintentMapper extends BaseMapper<Demandintent> {


//
//    @Select("select ID id,Phone phone,ContactName contactName,DemandDescript demandDescript,Url1 url1," +
//            "CreateDate createDate,LockDate lockDate,StaffID staffID,Status  status from demandintent")
  @Select("select * from demandintent")
    public List<Demandintent> findAllPurlnt();


    @Select("select * from demandintent where Status=0")
    public List<Demandintent> findPurlnt();

}
