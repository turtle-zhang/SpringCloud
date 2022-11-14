package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright (C), 2022-2022, 张三疯
 * Author: Administrator
 * Date: 2022/8/21 15:23
 * FileName: PaymentService
 * Description: 操作payment对应的业务接口
 */
public interface PaymentService {
    
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
