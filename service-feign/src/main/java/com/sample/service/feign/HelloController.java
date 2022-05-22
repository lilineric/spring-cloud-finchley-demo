package com.sample.service.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private ServiceHello serviceHello;


    @GetMapping("/hello")
    public String home(@RequestParam(value = "name") String name) {
        return serviceHello.sayHelloFromServiceA(name) + " from feign";
    }
}
