package com.study.java.controller;

import com.study.java.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("stud")
public class StudentController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("list")
    public List<Stu> list(){
        //数据库
        String sql ="select * from students;";
        List<Stu> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Stu.class));
        return list;
    }
}
