package com.ls.controller;

import com.ls.entity.Grade;
import com.ls.entity.GradeVo;
import com.ls.service.GradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author liusi
 * @Date 2020/8/24 16:36
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/grade")
public class GradeController {
    @Resource
    GradeService gradeService;
    @RequestMapping(value = "/add")
    private void addGrade(Grade grade){
        gradeService.addGrade(grade);
    }
    @RequestMapping(value = "/findAll")
    private List<GradeVo> findAllGrade(Grade grade){
        return gradeService.findAll();
    }
    @RequestMapping(value = "/findGood")
    private List<GradeVo> findGoodGrade(@RequestParam Float minScore ){
        return gradeService.findGood(minScore);
    }

}
