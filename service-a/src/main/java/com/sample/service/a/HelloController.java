package com.sample.service.a;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;


    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + " ! I'm " + applicationName + "! I'm from " + instanceId;
    }

    public String helloFallback(String name) {
        return "ERROR! " + name + " ! I'm " + applicationName + "! I'm from " + instanceId;
    }
}
