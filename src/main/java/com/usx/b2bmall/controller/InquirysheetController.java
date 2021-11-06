package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.InquirysheetMapper;
import com.usx.b2bmall.pojo.Inquirysheet;
import com.usx.b2bmall.pojo.InquirysheetDemand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
@RequestMapping("/inquirysheet")
public class InquirysheetController {

    @Autowired
    private InquirysheetMapper inquirysheetMapper;

    @GetMapping("/findAll")
    public List<Inquirysheet> findAll(){
       return  inquirysheetMapper.findAll();
    }


    @GetMapping("/findById/{id}")
    public Inquirysheet findById(@PathVariable("id")Integer id){
        return inquirysheetMapper.findById(id);
    }

    @PostMapping("/sendAnalysisDescript")
    public void sendAnalysisDescript(@RequestBody Inquirysheet inquirysheet){
         inquirysheet.setAnalysisDate(LocalDateTime.now());

         inquirysheetMapper.sendAnalysisDescript(inquirysheet);
    }
    
    @GetMapping("/findInquirysheetDemandById/{id}")
    public InquirysheetDemand findInquirysheetDemandById(@PathVariable("id")Integer id){
        InquirysheetDemand inquirysheetDemand = new InquirysheetDemand();
        inquirysheetDemand= inquirysheetMapper.findInquirysheetDemandById(id);

        return inquirysheetDemand;
    }


    @GetMapping("/findDirectPriceById/{id}")
    public InquirysheetDemand findDirectPriceById(@PathVariable("id") Integer id){
        return inquirysheetMapper.findDirectPriceById(id);
    }
}

