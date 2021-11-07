package com.usx.b2bmall.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.usx.b2bmall.mapper.DemandsupplyMapper;
import com.usx.b2bmall.mapper.SupplyMapper;
import com.usx.b2bmall.pojo.Demandsupply;
import com.usx.b2bmall.pojo.InquirysheetDemand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
@Controller
@ResponseBody
@RequestMapping("/demandsupply")
public class DemandsupplyController {

    @Autowired
    private DemandsupplyMapper demandsupplyMapper;


    //QC生成需求-供应报价单
    @PostMapping("/creatDemandSupplyByIds")
    public void  creatDemandSupplyByIds(@RequestBody Map<String,Object> map) {
        List<Integer> ids = JSONArray.parseArray(map.get("ids").toString(),Integer.class);
        Object form= map.get("form");
        InquirysheetDemand inquirysheetDemand = JSON.parseObject(JSON.toJSON(form).toString(),InquirysheetDemand.class);
         if(ids!=null && ids.size()>0){
            for(int i=0;i<ids.size();i++){
                Demandsupply demandsupply = new Demandsupply();
                demandsupply.setDemandID(inquirysheetDemand.getDemandID());
                demandsupply.setInquirySheetID(inquirysheetDemand.getId());
                demandsupply.setMerchantID(ids.get(i));
                demandsupply.setStatus(0);
                demandsupply.setTechnicianID(300);
                demandsupply.setIsSelected(0);
                demandsupply.setCreateDate(LocalDateTime.now());
                demandsupplyMapper.creatDemandSupplyById(demandsupply);
            }
        }
    }

    //根据商家的id获取相应的报价单
    @GetMapping("/findDemandSupplyById/{id}")
    public List<Demandsupply> findDemandSupplyById(@PathVariable("id")Integer id){
        return demandsupplyMapper.findDemandSupplyById(id);
    }


    //根据询价表去获得报价
    @GetMapping("/findDemandSupplyByNumId/{id}")
    public Demandsupply findDemandSupplyByNumId(@PathVariable("id")Integer id){
        return demandsupplyMapper.findDemandSupplyByNumId(id);
    }


    //商家报价
    @PostMapping("/merchantOffer")
    public void merchantOffer(@RequestBody Demandsupply demandsupply){
        demandsupply.setStatus(1);
        demandsupply.setQuotedDate(LocalDateTime.now());
        demandsupplyMapper.creatDemandSupplyMerchantOffer(demandsupply);
    }


    //技术人员查询全部的需求供应信息
    @GetMapping("/findAll")
    public List<Demandsupply> findAll(){
      return demandsupplyMapper.findAll();
    }

    //获取指定的报价审核信息
    @GetMapping("/findById/{id}")
    public Demandsupply findById(@PathVariable("id")Integer id){
        return demandsupplyMapper.findById(id);
    }

    //技术员进行审核
    @PostMapping("/sendAudit")
    public void sendAudit(@RequestBody Demandsupply demandsupply){
        demandsupplyMapper.sendAudit(demandsupply);
    }

    //领导进行审核
    @PostMapping("/secondAudit")
    public void secondAudit(@RequestBody Demandsupply demandsupply){
        demandsupply.setQuotedDate(LocalDateTime.now());
        demandsupplyMapper.sendAudit(demandsupply);
        demandsupplyMapper.secondAudit(demandsupply);
    }
}

