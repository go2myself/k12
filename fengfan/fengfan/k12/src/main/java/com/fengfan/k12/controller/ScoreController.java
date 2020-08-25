package com.fengfan.k12.controller;

import com.fengfan.k12.entity.Score;
import com.fengfan.k12.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping(value = "/score")
    public Map<String,String> getResult(@RequestBody Score score){
        int uid=score.getUid();
        Map<String,String> hm=new HashMap<>();
        Score score1=scoreService.findScoreById(uid);
        if(score1==null){
            int result=scoreService.insertScore(score);
            if(result>0){
                hm.put("插入结果","成功");
            }else {
                hm.put("插入结果","失败");
            }
        }else {
            int result=scoreService.updateScore(score);
            if(result>0){
                hm.put("插入结果","覆盖原有成绩成功");
            }else {
                hm.put("插入结果","插入失败");
            }
        }
        return hm;
    }
}
