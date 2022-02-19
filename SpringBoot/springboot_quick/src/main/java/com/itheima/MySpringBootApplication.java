package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot引导类
 * 要通过SpringBoot提供的引导类起步SpringBoot才可以进行访问
 */
@SpringBootApplication//是声明该类是一个SpringBoot的引导类
public class MySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);//运行SpringBoot的引导类

        //测试git远程协作功能
    }
}
