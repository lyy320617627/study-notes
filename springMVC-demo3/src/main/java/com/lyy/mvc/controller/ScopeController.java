package com.lyy.mvc.controller;

import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-26 11:05
 **/
@Controller
public class ScopeController {
//    使用servletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,servletAPI");
        return "success";
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav=new ModelAndView();
        //处理模型数据，即向请求域共享数据
        mav.addObject("testRequestScope","hello,ModelAndView");
        //设置视图名称
        mav.setViewName("success");
        return mav;
    }
    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","hello,model");
        return "success";
    }
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","hello,Map");
        return "success";
    }
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","hello,ModelMap");
        return  "success";
    }
}