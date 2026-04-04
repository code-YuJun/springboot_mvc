package com.study.java.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

// 读取配置中的变量
@Data
@Component
// 批量配置读取
@ConfigurationProperties(prefix = "xiaoming.user")
public class User {
    private String username; //等于key
    private String password;
    private List<String> gfs;
}
