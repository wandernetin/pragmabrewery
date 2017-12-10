package com.pragma.pragmabrewery.model;

import java.util.List;

public class Container {

    private int id;

    private int currentlyTemperature;

    private List<BeerEnum> beers;

    public Container(int currentlyTemperature, List<BeerEnum> beers) {
        this.currentlyTemperature = currentlyTemperature;
        this.beers = beers;
    }

    public Container() {

    }

    public int getCurrentlyTemperature() {
        return currentlyTemperature;
    }

    public void setCurrentlyTemperature(int currentlyTemperature) {
        this.currentlyTemperature = currentlyTemperature;
    }

    public List<BeerEnum> getBeers() {
        return beers;
    }

    public void setBeers(List<BeerEnum> beers) {
        this.beers = beers;
    }

    public Boolean isTempInRange() {
        if(beers == null) {
            return true;
        }
        for (BeerEnum beer: beers) {
            if (!beer.isTempInRange(currentlyTemperature)) {
                return false;
            }
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
