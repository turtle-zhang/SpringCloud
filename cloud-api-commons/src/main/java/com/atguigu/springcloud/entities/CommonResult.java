package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Copyright (C), 2022-2022, 张三疯
 * Author: Administrator
 * Date: 2022/8/21 15:15
 * FileName: CommonResult
 * Description: 通用的返回对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    // 异常返回，无有效数据
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
