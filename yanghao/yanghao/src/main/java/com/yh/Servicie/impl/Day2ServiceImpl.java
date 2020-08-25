package com.yh.Servicie.impl;

import com.yh.Servicie.Day2Service;
import org.springframework.stereotype.Service;


@Service
public class Day2ServiceImpl implements Day2Service {

    @Override
    public String converseName(String name){
        int length = name.length();
        String reverse = "";
        for (int i = 0; i < length; i++) {
            reverse = name.charAt(i)+reverse;
        }
        return reverse;
    }
}
