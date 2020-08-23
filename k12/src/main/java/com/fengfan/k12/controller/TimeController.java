package com.fengfan.k12.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TimeController {

    @RequestMapping(value = "/time")
    public Map<String, String> getTime() {
        String time = Long.toString(System.currentTimeMillis() / 1000L);
        Map<String, String> mp = new HashMap<>();
        mp.put("time", time);
        return mp;
    }

    @GetMapping(value = "/name")
    public Map<String, String> getName(String name) {
        char[] chars = name.toCharArray();
        Map<String, String> mp = new HashMap<>();
        String res = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            res += chars[i];
        }
        mp.put("name", res);
        return mp;
    }

    @PostMapping(value = "/sum")
    public Map<String,Integer> getSum(@RequestBody Integer[] arr){
        Map<String,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        map.put("sum",sum);
        return map;
    }
}
