package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.EcontractMapper;
import com.usx.b2bmall.pojo.Econtract;
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
@RequestMapping("/econtract")
public class EcontractController {

    @Autowired
    private EcontractMapper econtractMapper;

    @PostMapping("/save")
    public void save(@RequestBody Econtract econtract){
        econtract.setCreateDate(LocalDateTime.now());
        econtractMapper.insert(econtract);
    }

    @GetMapping("/getOne/{id}")
    public Econtract getOne(@PathVariable("id") Integer id){
        return econtractMapper.getOne(id);
    }

}

