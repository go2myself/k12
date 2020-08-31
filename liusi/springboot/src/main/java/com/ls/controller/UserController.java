package com.ls.controller;

import com.ls.entity.Users;
import com.ls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author liusi
 * @Date 2020/8/24 15:41
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping (value = "/add")
    private void addUser(Users user){
       userService.addUser( user);
    }

}
