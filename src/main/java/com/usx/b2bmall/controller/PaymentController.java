package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.PaymentMapper;
import com.usx.b2bmall.pojo.Order;
import com.usx.b2bmall.pojo.Payment;
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
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentMapper paymentMapper;

    @GetMapping("/all")
    public List<Payment> getAll(){
        return paymentMapper.getAll();
    }
}

