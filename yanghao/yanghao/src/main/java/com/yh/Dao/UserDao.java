package com.yh.Dao;

import com.yh.model.Score;
import com.yh.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    /**
     *新增用户
     * @param user
     */
    void addUser(User user);

    /**
     * 新增分数或者更新
     * @param score
     */
    void insertOrUpdate(Score score);

    List<Map> findScore(Double minScore);
}
