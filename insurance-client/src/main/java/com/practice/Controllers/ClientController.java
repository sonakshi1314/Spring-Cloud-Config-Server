package com.practice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    public RestTemplate template;

    @Value("${insurance.provider.url}") //in github
    private String url;


    @GetMapping("/getPlans")
    public List<String> getPlans(){
        //consume microservice
        List<String> plans = template.getForObject(url,List.class); //url and response type
        return plans;
    }
}
