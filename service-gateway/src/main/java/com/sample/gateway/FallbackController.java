package com.sample.gateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/fallbackcontroller")
    public String fallbackFeign() {
        return "ERROR";
    }
}
