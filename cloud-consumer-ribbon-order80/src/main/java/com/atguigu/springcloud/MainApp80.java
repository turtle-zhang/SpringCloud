package com.atguigu.springcloud;

import com.atguigu.ribbon.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Copyright (C), 2022-2022, 张三疯
 * Author: Administrator
 * Date: 2022/8/21 15:41
 * FileName: MainApp80
 * Description: 主启动类
 */
@SpringBootApplication
@EnableEurekaClient
// 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，形如
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
public class MainApp80 {
    public static void main(String[] args) {
        SpringApplication.run(MainApp80.class, args);
    }
}