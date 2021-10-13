package com.usx.b2bmall.service.impl;

import com.usx.b2bmall.pojo.News;
import com.usx.b2bmall.mapper.NewsMapper;
import com.usx.b2bmall.service.INewsService;
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
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
