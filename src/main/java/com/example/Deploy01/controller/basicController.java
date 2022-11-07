package com.example.Deploy01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController {

    @GetMapping("")
    public String getDevName() {
        return "Mario";
    }
}
