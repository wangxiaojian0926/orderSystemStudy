package com.wxj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author：wxj
 * Date：2020-01-04 17:58
 * Description：<描述>
 */
@SpringBootApplication
@MapperScan("com.wxj.repository")
public class MenuServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuServerApplication.class,args);
    }
}
