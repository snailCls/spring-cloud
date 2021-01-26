package com.example.service.provider;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zzh
 * @version:1.0
 * @since:1.0
 * @createTime:2021/1/26 11:44:39
 */
@FeignClient(name = "service-provider-8001", fallback = HelloRemoteImpl.class)
public interface HelloRemote {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);

}
