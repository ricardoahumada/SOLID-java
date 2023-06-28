package com.netmind.lsp.si.vehicles;

public class ElectricBus extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine...");
    }

    @Override
    public void accelerate(){
        this.increaseVoltage();
        this.connectIndividualEngines();
    }
    public void increaseVoltage(){
        System.out.println("Increasing voltage...");
    }
    public void connectIndividualEngines(){
        System.out.println("Connecting individual engines...");
    }
}
