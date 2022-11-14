package com.atguigu.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2022-2022, 张三疯
 * Author: Administrator
 * Date: 2022/9/18 23:58
 * FileName: MySelfRule
 * Description:自定义的ribbon检测策略
 */

/**
 * 官方文档明确给出了警告：
 * 这个自定义配置类不能放在@ComponentScan所扫描的当前包下以及子包下，
 * 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的了。
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
        // return new RoundRobinRule();  定义为轮询
    }
}
