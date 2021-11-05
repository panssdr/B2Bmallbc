package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.DemandMapper;
import com.usx.b2bmall.pojo.Demand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
@RestController
@ResponseBody
@RequestMapping("/demand")
public class DemandController {

    @Autowired
    private DemandMapper demandMapper;

    @GetMapping("/all")
    public List<Demand> demandAll(){
        return demandMapper.getAll();
    }


    @GetMapping("/homeDemand")
    public List<Demand> getHomeDemand(){
        return demandMapper.getHomeDemand();
    }


    @PostMapping("/createTableByCustomerService")
    public void createTableByCustomerService(@RequestBody Demand demand){
       demand.setCreateDate(LocalDateTime.now());
       demand.setStaffID(100);
       demand.setStatus(1);
       demandMapper.createTableByCustomerService(demand);
    }

}

