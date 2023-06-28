package com.netmind.lsp.si.vehicles;

public class Driver {
    public void go(Vehicle aV){
        aV.startEngine();
        aV.accelerate();
    }
}
