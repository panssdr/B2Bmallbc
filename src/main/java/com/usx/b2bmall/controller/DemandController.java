package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.DemandMapper;
import com.usx.b2bmall.pojo.Demand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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


}

