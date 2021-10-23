package com.example.limitsservice.controller;

import com.example.limitsservice.bean.Limits;
import com.example.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMin(), configuration.getMax());
        //return new Limits(1,1000);
    }
}