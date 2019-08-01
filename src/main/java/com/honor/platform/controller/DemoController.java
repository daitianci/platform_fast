package com.honor.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 戴天赐 on 2019/8/1.
 */
@Controller
public class DemoController {
    @RequestMapping("/demo")
    @ResponseBody
    public String print(){
        return "hello springboot";
    }
}
