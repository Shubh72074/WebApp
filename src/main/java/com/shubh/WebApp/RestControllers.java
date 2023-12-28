package com.shubh.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
    @GetMapping("/")
    public String Index(){
        return "Hello Index";
    }

    @GetMapping("/name/{n}")
    public String Name(@PathVariable String n) {
        return "Name: " + n;
    }
}
