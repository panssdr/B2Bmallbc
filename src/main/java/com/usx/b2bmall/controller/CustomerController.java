package com.usx.b2bmall.controller;


import com.usx.b2bmall.pojo.Customer;
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
    
   @PostMapping("/register")
    public void registerCustomer(Map<String,String> jsonString){
       System.out.println(jsonString.get("cotelephone"));
       System.out.println(jsonString.get("password"));
    }
}

