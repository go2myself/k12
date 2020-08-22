package com.ls.springboot.controller;

import com.ls.springboot.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author liusi
 * @Date 2020/8/21 10:25
 * @Version 1.0
 */
@RestController
@RequestMapping("/json")
public class UserController {
    @ResponseBody
    @RequestMapping("/user")
    public User getUser() {
        return new User((long) 1, "刘思", "123456");
    }

}
