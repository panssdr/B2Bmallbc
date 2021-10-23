package com.usx.b2bmall.controller;


//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.annotation.JSONField;
//import com.usx.b2bmall.pojo.Customer;
//import com.usx.b2bmall.pojo.User;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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
@RequestMapping("/customer")
public class CustomerController {
    
   @PostMapping(value = "/register")
    public void registerCustomer(@RequestBody Map<String,Object>map) {
       System.out.println(map.get("CoTelephone"));
       System.out.println(map.get("PassWord"));
    }

//    @PostMapping(value = "/register")
//    public void registerCustomer(HttpServletRequest request) {
//        System.out.println(request.getParameter("CoTelephone"));
//        System.out.println(request.getParameter("PassWord"));
//    }
}

