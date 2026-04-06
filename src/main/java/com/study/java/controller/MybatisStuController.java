package com.study.java.controller;

import com.study.java.mapper.StuMapper;
import com.study.java.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试 Mybatis
 */
@RestController
@RequestMapping("stu")
public class MybatisStuController {
    @Autowired
    private StuMapper stuMapper;
    @GetMapping
    public List<Stu> query(){
        return stuMapper.queryAll();
    }
}
