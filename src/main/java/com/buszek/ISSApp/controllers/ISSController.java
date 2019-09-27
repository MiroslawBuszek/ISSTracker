package com.buszek.ISSApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ISSController {
    @GetMapping("/issLocation")
    public String getISSLocation(){
        return "Hello ISS";
    }
}
