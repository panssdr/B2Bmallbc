package com.usx.b2bmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.usx.b2bmall.mapper")
public class B2bmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2bmallApplication.class, args);
    }

}
