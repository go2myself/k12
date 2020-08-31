package com.fengfan.k12.dao;

import com.fengfan.k12.entity.Score;
import com.fengfan.k12.vo.ScoreVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreDao {
    int insertScore(Score score);

    int updateScore(Score score);

    Score findScoreById(int uid);

    List<ScoreVo> minScore1(int minScore);
}
