package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
      @GetMapping("/testGetMapping")
      public String testGetMapping(){
      return "success";
      }
      @RequestMapping(value = "/testPut",method =RequestMethod.PUT)
    public String testPut(){
      return "success";
      }
      @RequestMapping(
              value="/testParamsAndHeaders",
              params = {"username"},
              headers = {"Host=localhost:8081"}
      )
    public String testParamsAndHeaders(){

      return "success";
      }
//         @RequestMapping("/a*a/testAnt")
         @RequestMapping("/**/testAnt")
    public String testAnt(){
      return "success";
         }
         @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable("username") String username){
             System.out.println("id:"+id);
             System.out.println("username："+username);
      return "success";
         }
}
