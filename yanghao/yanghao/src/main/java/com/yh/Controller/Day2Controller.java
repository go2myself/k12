package com.yh.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yh.Servicie.Day2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/day2")
public class Day2Controller {

    @Autowired
    private Day2Service day2Service;

    /**
     * test
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    /**
     * 反转字符串
     *
     * @param name
     * @return
     */

    @GetMapping("/name")
    public Map<String, String> ConverseName(@RequestBody String name) {
        Map<String, String> map = new HashMap<String, String>();
        String res = day2Service.converseName(name);
        map.put("name", res);
        return map;
    }

    @PostMapping("/sum")
    public Map sum(@RequestBody int[] x) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int sum = 0;
        for (int aX : x) {
            sum += aX;
        }
        map.put("sum", sum);
        return map;
    }


//    @PostMapping("/sum")
//    public String sum(@RequestBody String array){
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        int sum=0;
//        JSONArray x= JSON.parseArray(array);
//        for (int i=0;i<x.size();i++){
//            sum+=x.getIntValue(i);
//        }
//        JSONObject res=new JSONObject();
//        res.put("sum",sum);
//        return res.toJSONString();
//    }
//    @PostMapping("/sum")
//    public String sum(@RequestBody JSONArray array){
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        int sum=0;
//
//        for (int i=0;i<array.size();i++){
//            sum+=array.getIntValue(i);
//        }
//        JSONObject res=new JSONObject();
//        res.put("sum",sum);
//        return res.toJSONString();
//    }


}
