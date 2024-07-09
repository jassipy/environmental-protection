package com.neusoft.nepm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neusoft.nepm.mapper")
public class NepmserveApplication {

    public static void main(String[] args) {
        SpringApplication.run(NepmserveApplication.class, args);
    }

}
