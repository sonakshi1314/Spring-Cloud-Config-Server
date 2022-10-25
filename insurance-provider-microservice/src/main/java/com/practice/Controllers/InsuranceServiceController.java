package com.practice.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/Insurance")
public class InsuranceServiceController {

    @GetMapping("/getAllPlans")
    public List<String> getAllPlans(){
        return Arrays.asList("Premium","Gold","Platinum");
    }
}
