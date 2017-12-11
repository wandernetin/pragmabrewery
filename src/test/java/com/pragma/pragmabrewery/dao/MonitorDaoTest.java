package com.pragma.pragmabrewery.dao;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Wander on 09/12/2017.
 * Class represent MonitorDao Test.
 */
@RunWith(MockitoJUnitRunner.class)
public class MonitorDaoTest {

    @InjectMocks
    MonitorDao monitorDao;

    @Test
    public void createMonitorTest() {
        assertNotNull("Object monitor shouldn't be null", monitorDao.createMonitor());
    }

    public void generateTemperatureTest() {
        assertNotNull("Temperature shouldn't be null", monitorDao.generateTemperature());
    }
}
