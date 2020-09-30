package com.china.paulo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.china.paulo.mapper")
public class PauloApplication {

    public static void main(String[] args) {
        SpringApplication.run(PauloApplication.class, args);
    }

}
