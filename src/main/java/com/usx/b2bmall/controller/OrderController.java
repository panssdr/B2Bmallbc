package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.OrderMapper;
import com.usx.b2bmall.pojo.Demand;
import com.usx.b2bmall.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/all")
    public List<Order> getAll(){
        return orderMapper.getAll();
    }

    @GetMapping("/getOne/{id}")
    public Order getOne(@PathVariable("id") String id){
        return orderMapper.getOne(id);
    }
}

