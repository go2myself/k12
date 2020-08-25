package abc.wuyan.controller;

import abc.wuyan.model.User;
import abc.wuyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangcheng on 2020/8/24.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //添加用户
    @RequestMapping(value = "/add",method  = RequestMethod.POST)
    public Map<String,String> insert(User user) {
        Map<String,String> map = new HashMap<>();
        if (userService.insert(user))
            map.put("message","success");//添加成功
        else
            map.put("message","fail");//添加失败
        return map;
    }
}
