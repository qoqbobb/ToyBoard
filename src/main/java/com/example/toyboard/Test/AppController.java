package com.example.toyboard.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String hone(){
        return "Hello, World!!!";
    }
}
