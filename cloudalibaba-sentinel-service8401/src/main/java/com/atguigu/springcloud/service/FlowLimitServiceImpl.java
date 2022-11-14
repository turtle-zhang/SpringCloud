package com.atguigu.springcloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class FlowLimitServiceImpl {

    /**
     * 这个是会被定义为需要限流的资源，需要使用@SentinelResource标注
     * @return
     */
    @SentinelResource("findById")
    public String fingById(){
        return "牛逼";
    }
}
