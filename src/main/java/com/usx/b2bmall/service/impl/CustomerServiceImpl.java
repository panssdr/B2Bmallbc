package com.usx.b2bmall.service.impl;

import com.usx.b2bmall.pojo.Customer;
import com.usx.b2bmall.mapper.CustomerMapper;
import com.usx.b2bmall.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Panshenshen
 * @since 2021-10-13
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
