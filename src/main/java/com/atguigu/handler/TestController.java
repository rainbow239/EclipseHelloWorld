package com.atguigu.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    
    @RequestMapping("helloworld")
    public String index() {
        System.out.println("gogogo");
        return "success";
    }
    
}
