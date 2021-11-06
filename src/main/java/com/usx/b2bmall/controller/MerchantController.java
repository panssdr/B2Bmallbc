package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.MerchantMapper;
import com.usx.b2bmall.mapper.MerchantcertMapper;
import com.usx.b2bmall.pojo.Merchant;
import com.usx.b2bmall.pojo.Merchantcert;
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
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    private MerchantMapper merchantMapper;

    @GetMapping("/findAll")
    public List<Merchant> merchantFindAll(){
        return merchantMapper.merchantFindAll();
    }
}

