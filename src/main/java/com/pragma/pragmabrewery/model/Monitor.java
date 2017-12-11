package com.pragma.pragmabrewery.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wander on 09/12/2017.
 * This class represents monitor.
 */
public class Monitor {

    private List<Container> containerList;

    public Monitor() {
        this.containerList = new ArrayList<Container>();
    }

    public List<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(List<Container> containerList) {
        this.containerList = containerList;
    }
}
