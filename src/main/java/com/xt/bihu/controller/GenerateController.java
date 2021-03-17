package com.xt.bihu.controller;

import com.xt.bihu.util.GenerateFakeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class GenerateController {
    @Autowired
    private GenerateFakeData generateFakeData;

    @GetMapping("/generateData")
    public String test(){
        generateFakeData.generateData(1000);
        return "11111111111";
    }
}
