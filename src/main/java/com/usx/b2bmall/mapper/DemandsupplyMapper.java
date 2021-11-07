package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Demandsupply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface DemandsupplyMapper extends BaseMapper<Demandsupply> {

   @Insert("insert into demandsupply(DemandID,InquirySheetID,MerchantID,Status,CreateDate,isSelected,TechnicianID) " +
           " values(#{demandID},#{inquirySheetID},#{merchantID},#{status},#{createDate},#{isSelected},#{technicianID})")
    void creatDemandSupplyById(Demandsupply demandsupply);


   @Select("SELECT d1.ID id,d2.GoodsName goodsName,d2.Price price,d2.Amount amount,d1.CreateDate createDate, d1.Status status,d1.SupplyID supplyID ,d1.isSelected isSelected from  demandsupply d1 Left JOIN  demand d2 on  d1.DemandID=d2.ID where d1.MerchantID=#{id} ")
   List<Demandsupply> findDemandSupplyById(Integer id);


   @Select("SELECT d2.CategoryID1 categoryID1,d1.ID id,(select category.Name from category where d2.CategoryID1= category.ID)as category,d2.Specifications specifications,d2.Descript descript,d2.UsePurpose usePurpose,d2.GoodsName goodsName,d2.Price price,d2.Amount amount,d1.CreateDate createDate, d1.Status status,d1.SupplyID supplyID ,d1.isSelected isSelected from  demandsupply d1 Left JOIN  demand d2 on  d1.DemandID=d2.ID where d1.ID=#{id}")
    Demandsupply findDemandSupplyByNumId(Integer id);

   @Update("update demandsupply set Status=#{status},QuotedPrice=#{quotedPrice},QuotedDescript=#{quotedDescript},QuotedDate=#{quotedDate} where ID=#{id}")
    void creatDemandSupplyMerchantOffer(Demandsupply demandsupply);


    @Select("select * from demandsupply")
     List<Demandsupply> findAll();

    @Select("select * from demandsupply where Id=#{id}")
    Demandsupply findById(Integer id);

    @Update("update demandsupply set Status=#{status},AuditDescript=#{auditDescript} where ID=#{id}")
    void sendAudit(Demandsupply demandsupply);

    @Update("update inquirysheet set QuotedPrice=#{quotedPrice},MerchantID=#{merchantID},TechnicianID=#{technicianID},QuotedDate=#{quotedDate} where ID=#{inquirySheetID}")
    void secondAudit(Demandsupply demandsupply);
}
