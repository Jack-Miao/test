package com.mzy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description
 * @Author MiaoZhuoYang
 * @Date 2020-08-2020/8/18 21:11
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/zk/get")
    public String paymentzk() {
        return "Spring cloud with zk port: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
