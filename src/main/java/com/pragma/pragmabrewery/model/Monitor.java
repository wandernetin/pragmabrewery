package com.pragma.pragmabrewery.model;

import java.util.ArrayList;
import java.util.List;

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
