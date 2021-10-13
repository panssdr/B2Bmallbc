package com.usx.b2bmall.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;

import java.util.Collections;

/**
 * 自动生成类
 *
 * @author ：Panshenshen
 * @date ：Created in 2021/10/13
 */
public class MyGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create(
                //数据源配置
                new DataSourceConfig.Builder("jdbc:mysql://sh-cdb-p9ql3dvk.sql.tencentcdb.com:59961/b2b?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","u20701109")
                        .dbQuery(new MySqlQuery())
                        .schema("mybatis-plus")
                        .typeConvert(new MySqlTypeConvert())
                        .keyWordsHandler(new MySqlKeyWordsHandler())
        )

                //全局配置
                .globalConfig(builder -> {
                    builder.author("Panshenshen") // 设置作者
                            .disableOpenDir()//禁止打开输出目录
                            //.enableSwagger() // 开启 swagger 模式
                            //.fileOverride() // 覆盖已生成文件
                            .outputDir(System.getProperty("user.dir")+"/src/main/java"); // 指定输出目录
                })

                //包配置
                .packageConfig(builder -> {
                    builder.parent("com.usx.b2bmall") // 设置父
                            //.moduleName("sys")
                            .entity("pojo")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("controller")
                            //.other("other")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir")+"/src/main/resources/mapper"));
                })

                //策略配置
                .strategyConfig(builder -> {
                    builder.addInclude("productorshoppingcar","receiptevidence","refund","refundevidence","role","setting","staff","supply","supplyaudit","supplyimg") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            //.entityBuilder() //实体类配置
                            //.enableLombok()
                            //.enableTableFieldAnnotation()//实体类字段注解
                            //.controllerBuilder()//controller配置
                            //.enableRestStyle()//开启restcontroller
                            .mapperBuilder()
                            .enableMapperAnnotation();//开启mapper注解
                })
                //.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
