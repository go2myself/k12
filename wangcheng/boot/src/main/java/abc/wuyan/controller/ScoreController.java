package abc.wuyan.controller;

import abc.wuyan.model.NameAndScore;
import abc.wuyan.model.ScoreRecord;
import abc.wuyan.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangcheng on 2020/8/24.
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Map<String,String> add(ScoreRecord scoreRecord) {
        Map<String,String> map = new HashMap<>();
        if (scoreService.insert(scoreRecord))
            map.put("message","success");
        else
            map.put("message","fail");
        return map;
    }
    @RequestMapping("/findAll")
    public List<NameAndScore> findAll() {
        List<NameAndScore> list = scoreService.findAll();
        return list;
    }
    @RequestMapping("/findAllBig")
    public List<NameAndScore> findAllBig(String minScore) {
        List<NameAndScore> list = scoreService.findAllBig(Integer.parseInt(minScore));
        return list;
    }
}
