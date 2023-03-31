package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/")
    public ModelAndView SelectAllFromUser() {
        return new ModelAndView("hello");
    }
}