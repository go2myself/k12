package com.ls.mappers;

import com.ls.entity.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author liusi
 * @Date 2020/8/24 9:07
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    void addUser(Users users);

}
