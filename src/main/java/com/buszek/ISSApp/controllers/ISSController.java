package com.buszek.ISSApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ISSController {
    @GetMapping("/issLocation")
    public String getISSLocation(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.open-notify.org/iss-now.json", String.class);
    }
}
