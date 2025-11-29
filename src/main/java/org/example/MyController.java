package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${config.greeting}")
    private String greeting;

    @GetMapping("/hello")
    public String hello() {
        return greeting;
    }
}
