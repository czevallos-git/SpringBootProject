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
        System.out.println("Rendering main page");
        return "This is the main page of the app";
    }

    @GetMapping("/about")
    public String about(){
        System.out.println("Rendering about page");
        return "<h1>This is the about page</h1>";
    }

    @GetMapping("/learn")
    public String learn() {
        return "<h1>Articles</h1>";
    }
    
}