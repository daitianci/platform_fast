package com.honor.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 戴天赐 on 2019/8/1.
 */
@Controller
public class DemoController {
    //自定义配置文件属性导入demo，在启动类中需要配置加载自定义配置@PropertySource,（单属性导入，整体带入参考AppConfig类）
    @Value("${app.name}")
    private String name;

    //自定义属性的整体注入demo
    @Autowired
    AppConfig appConfig;

    @RequestMapping("/app")
    @ResponseBody
    public String print(){
        return name;
    }
}
