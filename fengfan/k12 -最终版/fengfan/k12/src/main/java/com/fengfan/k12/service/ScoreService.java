package com.fengfan.k12.service;


import com.fengfan.k12.entity.Score;
import com.fengfan.k12.vo.ScoreVo;


import java.util.List;


public interface ScoreService {


     int insertScore(Score score);

     int updateScore(Score score);

     Score findScoreById(int uid);

     List<ScoreVo> minScore(int minScore);
}
