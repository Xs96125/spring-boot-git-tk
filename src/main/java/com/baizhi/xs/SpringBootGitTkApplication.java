package com.baizhi.xs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.baizhi.xs.mapper")
public class SpringBootGitTkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGitTkApplication.class, args);
    }

}

