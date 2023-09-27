package com.enmotion.lsp.si.vehicles;

public abstract class Vehicle {
    public abstract void startEngine();
    public void accelerate(){
        System.out.println("Accelerating...");
    }
}
