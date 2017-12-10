package com.pragma.pragmabrewery.model;

import org.junit.Test;
import static org.junit.Assert.*;


public class BeerEnumTest {

    @Test
    public void tempInRangePilsenBeerTest() {
        assertFalse("Temp 7 must be out of range for Pilsen", BeerEnum.Pilsen.isTempInRange(7));
        assertFalse("Temp -5 must be out of range for Pilsen", BeerEnum.Pilsen.isTempInRange(-5));

        assertTrue("Temp -4 must be in range for Pilsen", BeerEnum.Pilsen.isTempInRange(-4));
        assertTrue("Temp 6 must be in range for Pilsen", BeerEnum.Pilsen.isTempInRange(6));
    }

    @Test
    public void tempInRangeIPABeerTest() {
        assertFalse("Temp 7 must be out of range for IPA", BeerEnum.IPA.isTempInRange(7));
        assertFalse("Temp -6 must be out of range for IPA", BeerEnum.IPA.isTempInRange(-6));

        assertTrue("Temp -5 must be in range for IPA", BeerEnum.IPA.isTempInRange(-5));
        assertTrue("Temp 6 must be in range for IPA", BeerEnum.IPA.isTempInRange(6));
    }

    @Test
    public void tempInRangeLagerBeerTest() {
        assertFalse("Temp 8 must be out of range for Lager", BeerEnum.Lager.isTempInRange(8));
        assertFalse("Temp -5 must be out of range fot Lager", BeerEnum.Lager.isTempInRange(-5));

        assertTrue("Temp -4 must be in range for Lager", BeerEnum.Lager.isTempInRange(-4));
        assertTrue("Temp 7 must be in range for Lager", BeerEnum.Lager.isTempInRange(7));
    }

    @Test
    public void tempInRangeStoutBeerTest() {
        assertFalse("Temp 9 must be out of range for Stout", BeerEnum.Stout.isTempInRange(9));
        assertFalse("Temp -7 must be out of range for Stout", BeerEnum.Stout.isTempInRange(-7));

        assertTrue("Temp -6 must be in range for Stout", BeerEnum.Stout.isTempInRange(-6));
        assertTrue("Temp 8 must be in range for Stout", BeerEnum.Stout.isTempInRange(8));
    }

    @Test
    public void tempInRangeWheatBeerTest() {
        assertFalse("Temp 6 must be out of range for Wheat Beer", BeerEnum.WheatBeer.isTempInRange(6));
        assertFalse("Temp -4 must be out of range for Wheat Beer", BeerEnum.WheatBeer.isTempInRange(-4));

        assertTrue("Temp -3 must be in range for Wheat Beer", BeerEnum.WheatBeer.isTempInRange(-3));
        assertTrue("Temp 5 must be in range for Wheat Beer", BeerEnum.WheatBeer.isTempInRange(5));
    }

    @Test
    public void tempInRangePaleAleBeerTest() {
        assertFalse("Temp 7 must be out of range for Pale Ale", BeerEnum.PaleAle.isTempInRange(7));
        assertFalse("Temp -5 must be out of range for Pale Ale", BeerEnum.PaleAle.isTempInRange(-5));

        assertTrue("Temp -4 must be in range for Pale Ale", BeerEnum.PaleAle.isTempInRange(-4));
        assertTrue("Temp must be in range for Pale Ale", BeerEnum.PaleAle.isTempInRange(6));
    }
}
