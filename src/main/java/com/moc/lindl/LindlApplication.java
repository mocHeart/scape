package com.moc.lindl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.moc.lindl.mapper")
public class LindlApplication {

    public static void main(String[] args) {
        SpringApplication.run(LindlApplication.class, args);
    }

}
