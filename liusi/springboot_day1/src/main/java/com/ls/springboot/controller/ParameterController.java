package com.ls.springboot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author liusi
 * @Date 2020/8/21 21:30
 * @Version 1.0
 */
@RestController
@RequestMapping("/param")
public class ParameterController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Map<String,String> getList(@RequestParam String  str){
        Map<String,String>  myList =new HashMap<>();
        StringBuffer str1= new StringBuffer(str).reverse();
        myList.put("name",str1.toString());


        return myList;

    }

}
