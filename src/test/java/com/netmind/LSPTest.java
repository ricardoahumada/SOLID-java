package com.netmind;

import com.netmind.lsp.si.vehicles.Car;
import com.netmind.lsp.si.vehicles.Driver;
import com.netmind.lsp.si.vehicles.ElectricBus;
import com.netmind.lsp.si.vehicles.Vehicle;
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