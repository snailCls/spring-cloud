package com.example.service.controller;

import com.example.service.provider.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zzh
 * @version:1.0
 * @since:1.0
 * @createTime:2021/1/26 14:09:35
 */
@RestController
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/hello")
    public String hello() {
        return helloRemote.hello("snail");
    }

}
