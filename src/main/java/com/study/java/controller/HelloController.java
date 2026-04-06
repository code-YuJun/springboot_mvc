package com.study.java.controller;
/**
 * 后端数据返回
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("boot")
    public String hello(){
        return "hellp springboot3!!";
    }
}
