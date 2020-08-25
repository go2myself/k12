package com.ls.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author liusi
 * @Date 2020/8/23 11:06
 * @Version 1.0
 */

@RestController
public class ParamController {

    @RequestMapping(value = "/time")
    public Map<String,String> getTime(){
        Map<String,String>  myList =new HashMap<>();

        myList.put("time",Long.toString(System.currentTimeMillis()/1000L));
        return myList;

    }
    @GetMapping(value = "param/get")
    public Map<String,String> getList(@RequestParam String  str){
        Map<String,String>  myList =new HashMap<>();
        StringBuffer str1= new StringBuffer(str).reverse();
        myList.put("name",str1.toString());
        return myList;
    }

    public Map<String, Integer> getArray(@RequestParam Integer[]  x){
        Map<String,Integer>  myList =new HashMap<>();
        Integer sum=0;
        for(Integer i:x){
            sum+=i;
        }
        myList.put("sum",sum);
        return myList;
    }
}
