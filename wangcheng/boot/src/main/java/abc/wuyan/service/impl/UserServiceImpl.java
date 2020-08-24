package abc.wuyan.service.impl;

import abc.wuyan.mapper.UserMapper;
import abc.wuyan.model.User;
import abc.wuyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangcheng on 2020/8/24.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean insert(User user) {
        if(userMapper.insert(user) > 0)
            return true;
        else
            return false;
    }
}
