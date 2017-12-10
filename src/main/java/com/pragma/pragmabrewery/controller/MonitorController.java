package com.pragma.pragmabrewery.controller;

import com.pragma.pragmabrewery.model.BeerEnum;
import com.pragma.pragmabrewery.model.Container;
import com.pragma.pragmabrewery.model.Monitor;
import com.pragma.pragmabrewery.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Class MonitorController.
 * Controller for dashboard.html
 */
@Controller
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    private Monitor monitor;

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("/dashboard");
        if (monitor == null) {
            monitor = monitorService.createMonitor();
        } else {
            monitorService.updateTemperature(monitor);
        }
        mv.addObject("monitor", monitor);
        mv.addObject("messages", monitorService.createMessages(monitor));
        return mv;
    }


    @GetMapping("/addContainer")
    public ModelAndView add(Container container) {

        ModelAndView mv = new ModelAndView("/editContainers");
        mv.addObject("beers", BeerEnum.values());
        mv.addObject("container", container);
        return mv;
    }
    @GetMapping("/editContainer/{id}")
    public ModelAndView edit(@PathVariable("id") int id) {
        return add(monitor.getContainerList().get(id - 1));
    }

    @PostMapping("/saveContainer/{id}")
    public ModelAndView save(@PathVariable("id") int id, Container container) {
        monitor.getContainerList().get(id - 1).setBeers(container.getBeers());
        return home();
    }
}
