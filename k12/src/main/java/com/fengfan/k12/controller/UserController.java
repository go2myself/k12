package com.fengfan.k12.controller;

import com.fengfan.k12.entity.User;
import com.fengfan.k12.service.UserService;
import com.fengfan.k12.vo.ScoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    public Map<String,String> getResult(@RequestBody User user){
        int result=userService.insertUser(user);
        Map<String,String> hm=new HashMap<>();
        if(result>0){
            hm.put("插入结果","成功");
        }else {
            hm.put("插入结果","失败");
        }
        return hm;
    }

    @GetMapping(value = "/all")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping(value = "/minScore")
    public List<ScoreVo> minScore(int minscore){
        List<ScoreVo> res=new ArrayList<>();
        List<User> list=userService.minScore(minscore);
        for(int i=0;i<list.size();i++){
            String name=list.get(i).getName();
            int score=list.get(i).getScore().getScore();
            ScoreVo sc=new ScoreVo();
            sc.setName(name);
            sc.setScore(score);
            res.add(sc);
        }
        return res;
    }
}
