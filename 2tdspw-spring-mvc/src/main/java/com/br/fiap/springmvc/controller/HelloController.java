package com.br.fiap.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello world");
        return "hello";
    }

    @GetMapping("/hello-view")
    public ModelAndView helloView() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "Hello world");
        return mv;
    }

}
