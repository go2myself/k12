package com.ls.controller;

import com.ls.entity.Grade;
import com.ls.entity.GradeVo;
import com.ls.service.GradeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/add")
    private void addGrade(Grade grade){
        gradeService.addGrade(grade);
    }

    @GetMapping(value = "/findAll")
    private List<GradeVo> findAllGrade(Grade grade){
        return gradeService.findAll();
    }

    @GetMapping(value = "/findGood")
    private List<GradeVo> findGoodGrade(@RequestParam Float minScore ){
        return gradeService.findGood(minScore);
    }

}
