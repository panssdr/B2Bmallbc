package com.usx.b2bmall.controller;

import com.usx.b2bmall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class SampleTest {

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/hello")
    public String test(){
        return userMapper.selectList(null).toString();
    }

}
