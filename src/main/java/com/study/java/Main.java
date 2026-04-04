package com.study.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //启动类
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args); //自动创建ioc容器,启动tomcat服务器软件
    }
}