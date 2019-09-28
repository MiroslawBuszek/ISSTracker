package com.buszek.ISSApp.controllers;

import com.buszek.ISSApp.models.IssLocator;
import com.buszek.ISSApp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ISSController {

     @Autowired
    private LocationService locationService;

    @GetMapping("/issLocation")
    @CrossOrigin
    public IssLocator getISSLocation() {
       return this.locationService.getIssLocation();

    }
}
