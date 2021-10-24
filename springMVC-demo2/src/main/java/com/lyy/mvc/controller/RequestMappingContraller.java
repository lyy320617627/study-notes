package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-24 18:03
 **/
@Controller
//@RequestMapping("/hello")
public class RequestMappingContraller {
  @RequestMapping(value = {
          "/testRequestMapping","/test"},
          method = {RequestMethod.POST}
  )
      public String success(){
        return "success";
      }
}
