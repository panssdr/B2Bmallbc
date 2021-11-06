package com.usx.b2bmall.mapper;

import com.usx.b2bmall.pojo.Inquirysheet;
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
public interface InquirysheetMapper extends BaseMapper<Inquirysheet> {


    @Select("SELECT ID,DemandID,QuotedPrice,MerchantID,QcID,Status,CreateDate,AnalysisDate,QuotedDate,TechnicianID,(SELECT demand.StaffID FROM demand where demand.ID= inquirysheet.DemandID )as staffID,(SELECT demand.CustomerID FROM demand where demand.ID= inquirysheet.DemandID )as customerID from inquirysheet")
    List<Inquirysheet> findAll();

    @Insert("insert into inquirysheet(DemandID,CreateDate,Status) values(#{demandID},#{createDate},#{status})")
    public void createByService(Inquirysheet inquirysheet);

    @Select("select * from inquirysheet where ID=#{id}")
    public Inquirysheet findById(Integer id);

    @Update("update inquirysheet set Status=1, GuidePrice=#{guidePrice}, AnalysisDescript=#{analysisDescript}," +
            " AnalysisDate=#{analysisDate} where ID=#{id}")
    void sendAnalysisDescript(Inquirysheet inquirysheet);
}
