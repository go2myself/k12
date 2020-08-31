package com.fengfan.k12.service.impl;

import com.fengfan.k12.dao.ScoreDao;
import com.fengfan.k12.entity.Score;
import com.fengfan.k12.service.ScoreService;
import com.fengfan.k12.vo.ScoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private ScoreDao scoreDao;

    public int insertScore(Score score){
        return scoreDao.insertScore(score);
    }

    public int updateScore(Score score){
        return scoreDao.updateScore(score);
    }

    public Score findScoreById(int uid){
        return scoreDao.findScoreById(uid);
    }

    public List<ScoreVo> minScore(int minScore){
        return scoreDao.minScore1(minScore);
    }
}
