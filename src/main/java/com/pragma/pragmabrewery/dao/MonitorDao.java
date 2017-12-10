package com.pragma.pragmabrewery.dao;

import com.pragma.pragmabrewery.model.BeerEnum;
import com.pragma.pragmabrewery.model.Container;
import com.pragma.pragmabrewery.model.Monitor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MonitorDao {

    public Monitor createMonitor() {
        Monitor monitor = new Monitor();
        List<Container> containerList = new ArrayList<Container>();
        for (BeerEnum beer: BeerEnum.values()) {
            List<BeerEnum> list = new ArrayList<BeerEnum>();
            list.add(beer);
            Container container = new Container(generateTemperature(), list);
            container.setId(containerList.size()+1);
            containerList.add(container);
        }
        monitor.setContainerList(containerList);
        return monitor;
    }



    // Creates a random temperature.
    public int generateTemperature() {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - (-7)) + 1) + (-7);
        return randomNum;
    }

    public void updateTemperature(Monitor monitor) {
        for (Container container: monitor.getContainerList()) {
            container.setCurrentlyTemperature(generateTemperature());
        }
    }


}
