package com.enmotion;

import com.enmotion.lsp.si.vehicles.Car;
import com.enmotion.lsp.si.vehicles.Driver;
import com.enmotion.lsp.si.vehicles.ElectricBus;
import com.enmotion.lsp.si.vehicles.Vehicle;
import org.junit.Test;

public class LSPTest {

    @Test
    public void driverTest() {
        Driver driver= new Driver();
        Vehicle aCar = new Car();
        Vehicle aEB = new ElectricBus();

        driver.go(aCar);
        driver.go(aEB);
    }
}