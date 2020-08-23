package com.fengfan.k12.dao;

import com.fengfan.k12.entity.Score;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDao {
    int insertScore(Score score);

    int updateScore(Score score);

    Score findScoreById(int uid);
}
