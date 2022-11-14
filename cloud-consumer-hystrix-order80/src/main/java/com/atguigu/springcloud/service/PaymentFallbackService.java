package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * 统一的异常处理类
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {


    /**
     * 方法名、反参、出参 要和被处理的方法一致
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-order80";
    }
}
