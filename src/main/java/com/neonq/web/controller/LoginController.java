package com.neonq.web.controller;

import com.neonq.web.forms.RegisterBean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ModelAndView getName() {
        ModelAndView response = new ModelAndView();
        response.addObject("name", "Ajay");
        response.setViewName("index");
        return response;
    }
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView signUpPage() {
        ModelAndView response = new ModelAndView();
        response.setViewName("signup");
        return response;
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public ModelAndView registerUser(@Valid  RegisterBean form, BindingResult errors) {
        ModelAndView response = new ModelAndView();

        if(errors.hasErrors()) {
            for (FieldError error : errors.getFieldErrors()) {
                form.getErrorMessages().add(error.getDefaultMessage());
                System.out.println("error field = " + error.getField() + " message = " + error.getDefaultMessage());
            }
            response.addObject("formBeanKey",form);
            response.setViewName("signup");
        } else {
            response.addObject("name",form.getName());
            response.setViewName("index");
        }

        return response;
    }


}
