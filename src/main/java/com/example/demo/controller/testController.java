package com.example.demo.controller;

import com.example.demo.serviceImpl.testService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class testController{
    private static final Logger logger = LoggerFactory.getLogger(testController.class);

    @Autowired
    testService serviceObj;

    @GetMapping("/{region}/gd")
    //@PreAuthorize("hasRole('USER')")
    public String getData(@PathVariable String region){
        System.out.println("- - - hit - - -");
        String result="";
        result = serviceObj.getJsonData(region);
        System.out.println("returning data = "+result);
        return result;
    }

}