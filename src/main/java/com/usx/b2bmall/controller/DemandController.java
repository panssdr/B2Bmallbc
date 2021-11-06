package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.DemandMapper;
import com.usx.b2bmall.mapper.InquirysheetMapper;
import com.usx.b2bmall.pojo.Demand;
import com.usx.b2bmall.pojo.Inquirysheet;
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
@RestController
@ResponseBody
@RequestMapping("/demand")
public class DemandController {

    @Autowired
    private DemandMapper demandMapper;

    @Autowired
    private InquirysheetMapper inquirysheetMapper;

    //获取所有的需求
    @GetMapping("/all")
    public List<Demand> demandAll(){
        return demandMapper.getAll();
    }


    //首页的需求
    @GetMapping("/homeDemand")
    public List<Demand> getHomeDemand(){
        return demandMapper.getHomeDemand();
    }

   //客服创建需求
    @PostMapping("/createTableByCustomerService")
    public void createTableByCustomerService(@RequestBody Demand demand){
       demand.setCreateDate(LocalDateTime.now());
       demand.setStaffID(100);
       demand.setStatus(1);
       demandMapper.createTableByCustomerService(demand);
    }

    //需求管理的内容
    @GetMapping("/deMan")
    public List<Demand> getDeMan(){
        return demandMapper.getDeMan();
    }


    @GetMapping("/sendInquiry/{id}")
    public void sendInquiry(@PathVariable("id") Integer id){
         demandMapper.sendInquiry(id);
        Inquirysheet inquirysheet = new Inquirysheet();
        inquirysheet.setDemandID(id);
        inquirysheet.setCreateDate(LocalDateTime.now());
        inquirysheet.setStatus(0);
         inquirysheetMapper.createByService(inquirysheet);
    }

}

