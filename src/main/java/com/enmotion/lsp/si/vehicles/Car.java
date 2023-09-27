package com.enmotion.lsp.si.vehicles;

public class Car extends Vehicle{
    @Override
    public void startEngine(){
        this.engageIgnition();
        System.out.println("Starting engine...");
    }
    private void engageIgnition(){
        System.out.println("Ignition...");
    }
}
