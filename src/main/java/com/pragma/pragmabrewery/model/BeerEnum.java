package com.pragma.pragmabrewery.model;

/**
 * Created by wander on 09/12/2017.
 *
 * Enum with range of all beers.
 */
public enum BeerEnum {

    Pilsen(0, "Pilsen", -4, 6),
    IPA(1, "IPA", -5, 6),
    Lager(2, "Lager", -4, 7),
    Stout(3, "Stout", -6, 8),
    WheatBeer(4, "Wheat Beer", -3, 5),
    PaleAle(5, "Pale Ale", -4, 6);

    private final int value;
    private final String name;
    private final int minRange;
    private final int maxRange;

    BeerEnum(int value, String name, int minRange, int maxRange) {
        this.value = value;
        this.name = name;
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    //Method that verify if this beer temperature is out of range.
    public boolean isTempInRange(int temp) {
        // if currently temperature is bigger than max range
        // or smaller than min range, return false cause is out of range
        if (temp > getMaxRange() ||
                temp < getMinRange()) {
            return false;
        }
        return true;
    }
}
