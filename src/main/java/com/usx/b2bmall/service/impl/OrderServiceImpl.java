package com.usx.b2bmall.service.impl;

import com.usx.b2bmall.pojo.Order;
import com.usx.b2bmall.mapper.OrderMapper;
import com.usx.b2bmall.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
