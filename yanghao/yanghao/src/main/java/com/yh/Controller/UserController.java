package com.yh.Controller;

import com.yh.Servicie.IUserService;
import com.yh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        System.out.println(user);
        userService.addUser(user);
    }
}
