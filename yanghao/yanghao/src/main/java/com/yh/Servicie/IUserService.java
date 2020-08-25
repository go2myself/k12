package com.yh.Servicie;

import com.yh.model.Score;
import com.yh.model.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public void addUser(User user);
    public void insertOrUpdate(Score score);
    public List<Map> findScore(Double minScore);
}
