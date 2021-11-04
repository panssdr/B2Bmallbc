package com.usx.b2bmall.controller;


import com.usx.b2bmall.mapper.DemandintentMapper;
import com.usx.b2bmall.pojo.Demandintent;
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
@RequestMapping("/demandintent")
public class DemandintentController {

    @Autowired
    private DemandintentMapper demandintentMapper;

    //所有快捷需求
    @GetMapping("/findAllPurlnt")
    public List<Demandintent> findAllPurlnt(){

        return demandintentMapper.findAllPurlnt();
    }

    //未处理的快捷需求
    @GetMapping("/findPurlnt")
    public List<Demandintent> findPurlnt(){

        return demandintentMapper.findPurlnt();
    }
}

