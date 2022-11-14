package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright (C), 2022-2022, 张三疯
 * Author: Administrator
 * Date: 2022/8/21 15:17
 * FileName: PaymentDao
 * Description: payment表对应的数据库映射类
 * @Mapper:需要使用该注解
 */
@Mapper   // org.apache.ibatis.annotations.Mapper
public interface PaymentDao {

    /**
     * 新增数据记录
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id查询对应的数据记录
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
