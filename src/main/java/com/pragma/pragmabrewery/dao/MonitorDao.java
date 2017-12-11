package com.pragma.pragmabrewery.dao;

import com.pragma.pragmabrewery.model.BeerEnum;
import com.pragma.pragmabrewery.model.Container;
import com.pragma.pragmabrewery.model.Monitor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Wander on 09/12/2017.
 * This class represents MonitorDao
 */
@Service
public class MonitorDao {

    //Method that create a new Monitor, for this project a monitor has 6 containers and each container has 1 different beer
    public Monitor createMonitor() {
        Monitor monitor = new Monitor();
        List<Container> containerList = new ArrayList<Container>();
        //for each container is added one different beer.
        for (BeerEnum beer: BeerEnum.values()) {
            List<BeerEnum> list = new ArrayList<BeerEnum>();
            list.add(beer);
            // generate random temperature.
            Container container = new Container(generateTemperature(), list);
            container.setId(containerList.size());
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

    // Update temperature of containers.
    public void updateTemperature(Monitor monitor) {
        for (Container container: monitor.getContainerList()) {
            container.setCurrentlyTemperature(generateTemperature());
        }
    }
}
