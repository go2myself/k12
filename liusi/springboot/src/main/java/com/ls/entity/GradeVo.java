package com.ls.entity;

import java.util.List;

/**
 * @Author liusi
 * @Date 2020/8/24 22:08
 * @Version 1.0
 */
public class GradeVo extends Grade {
    private String name;
    private Integer id;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
