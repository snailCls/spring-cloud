package com.example.service.provider;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zzh
 * @version:1.0
 * @since:1.0
 * @createTime:2021/1/26 11:51:32
 */
@Component
public class HelloRemoteImpl implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "access error";
    }

}
