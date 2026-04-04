package com.study.java.pojo;

import lombok.Data;

@Data
public class Stu {
    // 主键ID
    private Integer id;
    // 姓名
    private String name;
    // 性别
    private String gender;
    // 年龄
    private Integer age;
    // 班级
    private String className;
}
