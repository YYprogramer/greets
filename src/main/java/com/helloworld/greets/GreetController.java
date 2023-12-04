package com.helloworld.greets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello World";
    }
}
