package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    /**
     * 正常访问，一切OK
     *
     * @return
     */
    public String paymentInfo_OK() {
        return "线程池:" + Thread.currentThread().getName() ;
    }

}
