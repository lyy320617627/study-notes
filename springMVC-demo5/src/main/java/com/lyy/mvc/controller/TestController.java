package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-28 18:50
 **/
@Controller
public class TestController {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
        return "success";
    }

}
