package com.ls.service.Impl;

import com.ls.entity.Users;
import com.ls.mappers.UserMapper;
import com.ls.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author liusi
 * @Date 2020/8/24 15:42
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public void addUser(Users user) {
        userMapper.addUser(user);
    }
}
