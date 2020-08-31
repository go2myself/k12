package com.yh.Servicie.impl;

import com.yh.Dao.UserDao;
import com.yh.Servicie.IUserService;
import com.yh.model.Score;
import com.yh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void insertOrUpdate(Score score) {
        userDao.insertOrUpdate(score);
    }

    @Override
    public List<Map> findScore(Double minSore) {
        return userDao.findScore(minSore);
    }
}
