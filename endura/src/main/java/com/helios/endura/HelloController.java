package com.helios.endura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Sending Hello World to web browser");
        return "Hello, World!";
    }
}