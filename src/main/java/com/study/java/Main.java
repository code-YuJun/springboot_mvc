package com.study.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 指定 mapper 接口所在的位置
@MapperScan("com.study.java.mapper")
@SpringBootApplication  //启动类
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args); //自动创建ioc容器,启动tomcat服务器软件
    }
}