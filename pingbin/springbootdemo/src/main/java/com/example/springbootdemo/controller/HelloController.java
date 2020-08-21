package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.Time;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping(value = "/time",method = RequestMethod.GET)
    public Time getTime(){
        Time time = new Time();

        time.setTime( new Date().getTime());
        return time;
    }
}
