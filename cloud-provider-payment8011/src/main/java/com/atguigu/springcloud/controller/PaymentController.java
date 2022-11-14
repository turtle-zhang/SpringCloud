package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get")
    public String get() {
        return "payment provider service【GET】: " + "\t" + serverPort;
    }

    @GetMapping("/lb")
    public String lb() {
        return "payment provider service【LB】: " + "\t" + serverPort;
    }
}
