package com.ls.service.Impl;

import com.ls.entity.Grade;
import com.ls.mappers.GradeMapper;
import com.ls.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author liusi
 * @Date 2020/8/24 16:49
 * @Version 1.0
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    GradeMapper gradeMapper;
    @Override
    public void addGrade(Grade grade) {
       Grade existRecord =gradeMapper.findByUid(grade.getUid());
       if(existRecord==null){
           gradeMapper.addGrade(grade);
       }else{
           gradeMapper.update(grade);//如果存在
       }

    }

    @Override
    public List<Grade> findAll() {
        return gradeMapper.findAll();
    }
}
