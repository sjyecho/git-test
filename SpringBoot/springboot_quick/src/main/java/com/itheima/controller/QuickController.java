package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {

    @RequestMapping("/quick")
    @ResponseBody//将方法的返回值加载到response的body区域,如果方法上边不写ResponseBody，那么将使用ModelAndView(视图解析器)对象来封装一个方法返回的值
    public String quick(){
        return "hello springboot";
    }
}
