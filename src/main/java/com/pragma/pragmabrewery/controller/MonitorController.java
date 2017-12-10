package com.pragma.pragmabrewery.controller;

import com.pragma.pragmabrewery.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("/dashboard");
        mv.addObject("containers", beerService.getAllContainers());
        return mv;
    }
}
