package com.pragma.pragmabrewery.model;

import java.util.List;

/**
 * Created by Wander on 09/12/2017.
 * Class that represents a container.
 */
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    //Method that verify if all beers are in their range.
    public Boolean isTempInRange() {
        //if there is no beer in container, so return true.
        if(beers == null) {
            return true;
        }
        // if there is one or more beer, verify each one and if there is one
        // out of range, so return false.
        for (BeerEnum beer: beers) {
            if (!beer.isTempInRange(currentlyTemperature)) {
                return false;
            }
        }
        return true;
    }

    //Method that return a String with which beers are out of range. Using to build messages.
    public String whichBeersAreOutOfRange() {
        String result = "";
        for (BeerEnum beer: beers) {
            if (!beer.isTempInRange(currentlyTemperature)) {
                result = (result.length() > 0) ? result + " ; " + beer.getName() :  result + beer.getName();
            }
        }
        return result;
    }
}
