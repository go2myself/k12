package abc.wuyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping("/getName")
    public Map<String,String> getName(String name) {
        String nameReverse = new StringBuilder(name).reverse().toString();
        Map<String,String> map = new HashMap<>();
        map.put("name",nameReverse);
        return map;
    }

    @RequestMapping(value = "/getSum",method = RequestMethod.POST)
    public Map<String,Integer> getSum(int[] array) {
        Integer sum = 0;//定义sum求和
        //求和
        if(array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        Map<String,Integer> map = new HashMap<>();
        map.put("sum",sum);
        return map;
    }
}
