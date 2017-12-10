package com.pragma.pragmabrewery.model;


import org.junit.Test;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

public class ContainerTest {



    @Test
    public void tempInRangeTest() {

        List<BeerEnum> list = new ArrayList<BeerEnum>();
        list.add(BeerEnum.IPA);
        list.add(BeerEnum.Pilsen);

        Container container1 = new Container(7, list);
        Container container2 = new Container(4, list);
        Container container3 = new Container(10, null);




        assertFalse("When temperature is 7, must be out of range", container1.isTempInRange());
        assertTrue("When temperature is 4, must be in range", container2.isTempInRange());
        assertTrue("When temperature is 10, must be in range for container null", container3.isTempInRange());
    }

}
