package com.yh.Dao;

import com.yh.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    /**
     *新增用户
     * @param user
     */
    void addUser(User user);
}
