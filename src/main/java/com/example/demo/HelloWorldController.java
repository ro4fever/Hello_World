package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String sayHi() {
        return "Hello world";
    }

//    @GetMapping("/{name}")
//    public String sayHiToSomeOne(@PathVariable String name) {
//        return "Hello " + name;
//    }

    @GetMapping("/{date}")
    public String returnDate() {
        return new Date().toString();
    }
}