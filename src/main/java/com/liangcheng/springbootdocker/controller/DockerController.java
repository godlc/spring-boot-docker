package com.liangcheng.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("hello")
    public String hello(){
        return "hello docker";
    }
}
