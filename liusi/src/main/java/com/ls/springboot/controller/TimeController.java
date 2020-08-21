package com.ls.springboot.controller;

import com.ls.springboot.dao.Time;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liusi
 * @Date 2020/8/21 11:00
 * @Version 1.0
 */
@RestController
@RequestMapping("/json")
public class TimeController {
    //    @ResponseBody
    @RequestMapping("/time")
    public Time time() {

        //System.currentTimeMillis() 取得当前时间戳（精确到秒）
        //return "Long.toString(System.currentTimeMillis()/1000L)";
        return new Time(Long.toString(System.currentTimeMillis()/1000L));
    }
}
