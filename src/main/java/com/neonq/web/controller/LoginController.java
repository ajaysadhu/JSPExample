package com.neonq.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ModelAndView getName() {
        ModelAndView response = new ModelAndView();
        response.addObject("name", "Ajay");
        response.setViewName("index");
        return response;
    }
}
