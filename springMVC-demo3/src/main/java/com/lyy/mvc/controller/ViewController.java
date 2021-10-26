package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-26 16:08
 **/
@Controller
public class ViewController {
    @RequestMapping("/testThymeleafView")
    public String testThyMeleafView(){
        return "success";
    }
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }
    @RequestMapping("/testRedirect")
    public String testRedirect(){

        return "redirect:/testThymeleafView";
    }
}
