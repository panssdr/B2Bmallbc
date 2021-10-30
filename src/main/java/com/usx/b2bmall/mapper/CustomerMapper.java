package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.usx.b2bmall.pojo.CustomerRigster;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
public interface CustomerMapper extends BaseMapper<Customer> {

    @Insert("INSERT INTO customer(PassWord,Phone,RegisterDate,RegisterType,Status) values(#{passWord},#{phone},#{registerDate},#{registerType}," +
            "#{status})")
    public int registerCustomer(Customer customer);


    @Select("SELECT ID id,Phone as type,Name specifications," +
            "CoName priceAndAmount,CoAddress amount,RegisterDate registerDate, " +
            "case RegisterType when 0 then '个人注册' when 1 then " +
            "'客服注册'end as registerType,CASE Status when 0 then " +
            "'未审核' when 1 then '审核通过' when 2 then '审核未通过' " +
            "end as status,CASE IsIndividual when 0 then '非个人用户' " +
            "when 1 then '个人用户' end as isIndividual,AuditorID auditorID from customer")
    public List<CustomerRigster> findAllCustomer();

    @Update("update customer set Status=1 where ID=#{id} ")
    public void customerPass(Integer id);

    @Select("SELECT ID id,Phone as type,Name specifications," +
            "CoName priceAndAmount,CoAddress amount,RegisterDate registerDate, " +
            "case RegisterType when 0 then '个人注册' when 1 then " +
            "'客服注册'end as registerType,CASE Status when 0 then " +
            "'未审核' when 1 then '审核通过' when 2 then '审核未通过' " +
            "end as status,CASE IsIndividual when 0 then '非个人用户' " +
            "when 1 then '个人用户' end as isIndividual,AuditorID auditorID from customer where ID=#{id}")
    public CustomerRigster findById(Integer id);

    @Update("update customer set Status=2 where ID=#{id} ")
    void customerFail(Integer id);
}
