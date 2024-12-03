package com.walker.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/view/hello.jsp");
        //稍后将这个信息显示在hello.jsp中，modelAndView.addObject相当于request.setAttribute(name,value)
        modelAndView.addObject("msg","这是第一个springboot程序!");
        return modelAndView;
    }
}
