package com.pragma.pragmabrewery.service;

import com.pragma.pragmabrewery.dao.MonitorDao;
import com.pragma.pragmabrewery.model.BeerEnum;
import com.pragma.pragmabrewery.model.Container;
import com.pragma.pragmabrewery.model.Monitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonitorService {


    @Autowired
    private MonitorDao monitorDao;

    public Monitor createMonitor() {
        return monitorDao.createMonitor();
    }

    public List<String> createMessages(Monitor monitor) {
        List<String> messagesList = new ArrayList<String>();
        for (Container container: monitor.getContainerList()) {
            if(!container.isTempInRange()) {
                messagesList.add("Container number " + container.getId()
                        + " is out of range for: " + container.whichBeersAreOutOfRange());
            }
        }
        return messagesList;
    }

    public void updateTemperature(Monitor monitor) {
        monitorDao.updateTemperature(monitor);
    }

    }
