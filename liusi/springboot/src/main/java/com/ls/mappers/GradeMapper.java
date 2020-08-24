package com.ls.mappers;

import com.ls.entity.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author liusi
 * @Date 2020/8/24 16:48
 * @Version 1.0
 */
@Mapper
public interface GradeMapper {
    void addGrade(Grade grade);
    Grade findByUid(Integer uid);
    void update(Grade grade);
    List<Grade> findAll();
}
