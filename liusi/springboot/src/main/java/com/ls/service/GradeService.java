package com.ls.service;

import com.ls.entity.Grade;

import java.util.List;

/**
 * @Author liusi
 * @Date 2020/8/24 16:48
 * @Version 1.0
 */
public interface GradeService {
    void addGrade(Grade grade);

    List<Grade> findAll();
}
