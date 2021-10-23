package com.usx.b2bmall.controller;


//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.annotation.JSONField;
//import com.usx.b2bmall.pojo.Customer;
//import com.usx.b2bmall.pojo.User;
import com.usx.b2bmall.mapper.CustomerMapper;
import com.usx.b2bmall.pojo.Customer;
import com.usx.b2bmall.pojo.CustomerRigster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
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

     @Autowired
     private CustomerMapper customerMapper;

   @PostMapping("/register")
   @CrossOrigin
    public void registerCustomer(@RequestBody Map<String,Object>map) {
       Customer customer = new Customer();
       customer.setRegisterType(0);
       customer.setStatus(0);
       customer.setRegisterDate(LocalDateTime.now());
       customer.setPhone((String) map.get("CoTelephone"));
       customer.setPassWord((String) map.get("PassWord"));
       customerMapper.registerCustomer(customer);
    }

    @GetMapping("/findAll")
    public List<CustomerRigster> findAllCustomer(){
           return customerMapper.findAllCustomer();
    }
//    @PostMapping(value = "/register")
//    public void registerCustomer(HttpServletRequest request) {
//        System.out.println(request.getParameter("CoTelephone"));
//        System.out.println(request.getParameter("PassWord"));
//    }
}

