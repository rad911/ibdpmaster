package com.sdu.ibdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolutionController {
    @RequestMapping("/hello")
    public  String hello(){
        return "hello";
    }
}
