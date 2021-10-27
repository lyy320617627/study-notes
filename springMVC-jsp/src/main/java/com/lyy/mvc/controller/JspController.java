package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-26 19:23
 **/
@Controller
public class JspController {
@RequestMapping("/success")
    public String success(){
    return "success";
}
}
