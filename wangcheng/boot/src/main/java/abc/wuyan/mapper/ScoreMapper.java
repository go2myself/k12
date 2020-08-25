package abc.wuyan.mapper;

import abc.wuyan.model.NameAndScore;
import abc.wuyan.model.ScoreRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wangcheng on 2020/8/24.
 */
@Mapper
public interface ScoreMapper {
    int insert(ScoreRecord record);
    ScoreRecord findById(int uid);
    int update(ScoreRecord scoreRecord);
    List<NameAndScore> findAll();
    List<NameAndScore> findAllBig(Integer minScore);
}
