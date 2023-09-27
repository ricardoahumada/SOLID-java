package com.enmotion.lsp.si.vehicles;

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
    private void increaseVoltage(){
        System.out.println("Increasing voltage...");
    }
    private void connectIndividualEngines(){
        System.out.println("Connecting individual engines...");
    }
}
