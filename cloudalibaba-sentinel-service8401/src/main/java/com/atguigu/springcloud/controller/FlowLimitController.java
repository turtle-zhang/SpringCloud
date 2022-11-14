package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.service.FlowLimitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class FlowLimitController {

    @Autowired
    private FlowLimitServiceImpl flowLimitService;

    /**
     * A B 会去调用flowLimitService中的方法，如果显示testA的QPS，testB不会受到影响
     *
     * @return
     */
    @GetMapping("/testA")
    public String testA() {
        return "------testA=======" + flowLimitService.fingById();
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB=======" + flowLimitService.fingById();
    }

    @GetMapping("/testD")
    public String testD() {
        //暂停几秒钟线程
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/testF")
    public String testF() {
        int age = 10 / 0;
        return "------testF";
    }

    @GetMapping("/testG")
    public String testG() {
        int age = 10 / 0;
        return "------testG 测试异常比例";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "dealHandler_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "------testHotKey";
    }

    public String dealHandler_testHotKey(String p1, String p2, BlockException exception) {
        return "-----dealHandler_testHotKey";
    }
}

