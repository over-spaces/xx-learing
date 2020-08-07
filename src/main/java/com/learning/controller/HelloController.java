package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(HttpSession session){
        session.setAttribute("hello", "hello springboot");
        return "hello springboot";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(ModelMap map){
        map.put("name", "hello thymeleaf");
        return "thymeleaf";
    }
}
