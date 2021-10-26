package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-26 10:44
 **/
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
