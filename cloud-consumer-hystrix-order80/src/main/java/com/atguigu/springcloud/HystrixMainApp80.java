package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Copyright (C), 2022-2022, 张三疯
 * Author: Administrator
 * Date: 2022/10/8 9:41
 * FileName: MainApp80
 * Description: 主启动类
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixMainApp80 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMainApp80.class,args);
    }
}
