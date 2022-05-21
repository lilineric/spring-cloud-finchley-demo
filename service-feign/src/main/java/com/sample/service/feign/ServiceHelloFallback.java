package com.sample.service.feign;

import org.springframework.stereotype.Component;

@Component
public class ServiceHelloFallback implements ServiceHello{
    @Override
    public String sayHelloFromServiceA(String name) {
        return "ERROR! " + name;
    }
}
