package com.pragma.pragmabrewery.model;

/**
 * Created by wander on 09/12/2017.
 *
 * Enum with range of all beers.
 */
public enum BeerEnum {

    Pilsen(0, -4, 6),
    IPA(1, -5, 6),
    Lager(2, -4, 7),
    Stout(3, -6, 8),
    WheatBeer(4, -3, 5),
    PaleAle(5, -4, 6);

    private final int value;
    private final int minRange;
    private final int maxRange;

    BeerEnum(int value, int minRange, int maxRange) {
        this.value = value;
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public int getValue() {
        return value;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public boolean isTempInRange(int temp) {
        if (temp > getMaxRange() ||
                temp < getMinRange()) {
            return false;
        }
        return true;
    }
}
