package com.yh.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/time")
public class TimeController {

    @GetMapping()
    public Map<String, Long> getTime(){
        Map<String, Long> time=new HashMap<>();
//        获取时间戳比较快的方法：1.如下。2.new Date().getTime()。
        time.put("time",System.currentTimeMillis());
        return time;
    }
}
