package com.yh.Servicie.impl;

import com.yh.Dao.UserDao;
import com.yh.Servicie.IUserService;
import com.yh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user){
        userDao.addUser(user);
    }
}
