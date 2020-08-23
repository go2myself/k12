package com.fengfan.k12.dao;

import com.fengfan.k12.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    int insert(User user);

    List<User> getAll();

    List<User> minScore(int minScore);
}
