package com.fengfan.k12.service.impl;

import com.fengfan.k12.dao.UserDao;
import com.fengfan.k12.entity.User;
import com.fengfan.k12.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public int insertUser(User user){
        return userDao.insert(user);
    }

    public List<User> getAll(){
        return userDao.getAll();
    }

    public List<User> minScore(int minScore){
        return userDao.minScore(minScore);
    }
}
