package com.mzy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * create by MiaoZhuoayang on 2020/8/23 21:31
 */
@FeignClient(value = "app-user")
public interface UserService {

    @GetMapping("/")
    public String test();
}
