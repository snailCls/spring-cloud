package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zzh
 * @version:1.0
 * @since:1.0
 * @createTime:2021/1/26 14:36:47
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return "provider-two ===> hello " + name;
    }

}
