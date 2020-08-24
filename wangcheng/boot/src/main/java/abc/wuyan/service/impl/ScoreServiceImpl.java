package abc.wuyan.service.impl;

import abc.wuyan.mapper.ScoreMapper;
import abc.wuyan.model.NameAndScore;
import abc.wuyan.model.ScoreRecord;
import abc.wuyan.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangcheng on 2020/8/24.
 */
@Service
public class ScoreServiceImpl implements ScoreService{
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public boolean insert(ScoreRecord scoreRecord) {
        //未插入过该用户的分数
        ScoreRecord findRecord = scoreMapper.findById(scoreRecord.getUid());
        if(findRecord == null) {
            if(scoreMapper.insert(scoreRecord) > 0)
                return true;
            else
                return false;
        } else {//已存在分数，覆盖
            if(scoreMapper.update(scoreRecord) > 0)
                return true;
            else
                return false;
        }
    }

    @Override
    public List<NameAndScore> findAll() {
        return scoreMapper.findAll();
    }

    @Override
    public List<NameAndScore> findAllBig(Integer minScore) {
        return scoreMapper.findAllBig(minScore);
    }
}
