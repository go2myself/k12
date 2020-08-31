package com.yh.Controller;

import com.yh.Servicie.IUserService;
import com.yh.model.Score;
import com.yh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        System.out.println(user);
        userService.addUser(user);
    }

    @PostMapping("/addScore")
    public void addScore(@RequestBody Score score) {
        userService.insertOrUpdate(score);
    }

    /**
     * 查找大于最低分的姓名和分数
     *
     * @param minScore
     */
    @PostMapping("findScore")
    public List<Map> findScore(@RequestBody Double minScore) {
        return userService.findScore(minScore);
    }
}
