package com.pragma.pragmabrewery.model;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

public class ContainerTest {


    Container container1;
    Container container2;
    Container container3;
    Container container4;


    @Before
    public void initializeVariables() {
        List<BeerEnum> list = new ArrayList<BeerEnum>();
        list.add(BeerEnum.IPA);
        list.add(BeerEnum.Pilsen);
        list.add(BeerEnum.WheatBeer);

        container1 = new Container(7, list);
        container2 = new Container(4, list);
        container3 = new Container(10, null);
        container4 = new Container(6, list);
    }

    @Test
    public void tempInRangeTest() {
        assertFalse("When temperature is 7, must be out of range", container1.isTempInRange());
        assertTrue("When temperature is 4, must be in range", container2.isTempInRange());
        assertTrue("When temperature is 10, must be in range for container null", container3.isTempInRange());
    }

    @Test
    public void whichBeersAreOutOfRangeTest() {
        assertEquals("String must be 'IPA ; Pilsen ; Wheat Beer'", "IPA ; Pilsen ; Wheat Beer", container1.whichBeersAreOutOfRange());
        assertEquals("String must be 'Wheat Beer'", "Wheat Beer", container4.whichBeersAreOutOfRange());
    }

}
