package com.shubh.WebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/all")
    public List Details() {
        List<Users> UsersT = new ArrayList<>();
        UsersT.add(new Users(1,"Shubham Nishad"));
        UsersT.add(new Users(2,"Saurav Nishad"));
        return UsersT;
    }
}
