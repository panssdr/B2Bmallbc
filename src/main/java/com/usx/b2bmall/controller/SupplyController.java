package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.SupplyMapper;
import com.usx.b2bmall.pojo.Supply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

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
@RequestMapping("/supply")
public class SupplyController {
    @Autowired
    private SupplyMapper supplyMapper;

    @GetMapping("/all")
    public List<Supply> getAll(){
        return supplyMapper.getAll();
    }

    @GetMapping("/homeSupply")
    public List<Supply> getHomeSupply() { return supplyMapper.getHomeSupply();}

}

