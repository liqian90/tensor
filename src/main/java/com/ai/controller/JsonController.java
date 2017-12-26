package com.ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by qian on 2017/12/21.
 */
@Controller
public class JsonController {
    @RequestMapping(path = {"/wl"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map<String,String> getWl(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("name","姓名:小乐乐");
        map.put("sports","爱好：篮球，排球，羽毛球，乒乓球");
        map.put("age"," 年龄:23");
        return map;
    }
}
