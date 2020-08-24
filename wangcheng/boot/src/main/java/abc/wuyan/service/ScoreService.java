package abc.wuyan.service;

import abc.wuyan.model.NameAndScore;
import abc.wuyan.model.ScoreRecord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020/8/24.
 */
public interface ScoreService {
    boolean insert(ScoreRecord scoreRecord);
    List<NameAndScore> findAll();
    List<NameAndScore> findAllBig(Integer minScore);
}
