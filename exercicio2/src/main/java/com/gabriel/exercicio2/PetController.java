package com.gabriel.exercicio2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PetController {

    @GetMapping(value = "/pets")
    public ModelAndView mostraNomes() {
        ModelAndView mv = new ModelAndView("pets");
        return mv;
    }
}
