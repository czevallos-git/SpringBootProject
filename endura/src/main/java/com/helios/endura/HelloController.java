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

    @GetMapping("/")
    public String index(){
        System.out.println("Sending index message to web browser");
        return "This is the main page of the app";
    }
}