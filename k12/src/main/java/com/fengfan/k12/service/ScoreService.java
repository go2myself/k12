package com.fengfan.k12.service;

import com.fengfan.k12.dao.ScoreDao;
import com.fengfan.k12.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
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
}
