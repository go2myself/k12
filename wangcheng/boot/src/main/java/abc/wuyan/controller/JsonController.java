package abc.wuyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanghcheng on 2020/8/21.
 */
@ResponseBody
@Controller
public class JsonController {
    @RequestMapping("/time")
    public Map<String,String> time() {
        String dateStr = Long.toString(System.currentTimeMillis()/1000L);//当前Unix时间戳
        Map<String,String> map = new HashMap<>();
        map.put("time",dateStr);
        return map;
    }
}
