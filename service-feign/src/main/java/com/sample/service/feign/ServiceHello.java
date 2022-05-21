package com.sample.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-a", fallback = ServiceHelloFallback.class)
public interface ServiceHello {
    @GetMapping("/hello")
    String sayHelloFromServiceA(@RequestParam(value = "name") String name);
}
