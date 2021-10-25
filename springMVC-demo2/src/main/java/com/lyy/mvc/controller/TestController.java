package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Description:
* @Param:
* @return:
* @Author: ly
* @Date: 2021/10/24
*/
@Controller
public class TestController {
     @RequestMapping("/")
    public String index(){
         return "index";
     }
     @RequestMapping("/param")
    public String param(){
         return "test_param";
     }
}
