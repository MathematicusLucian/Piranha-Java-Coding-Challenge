package com.piranha;

public class Rustbucket extends Vehicle {
    
    private final CarAlarmSystem carAlarmSystem;    
    private final String vehicleType;

    public Rustbucket(CarAlarmSystem carAlarmSystem, String vehicleType) {
        super(carAlarmSystem, vehicleType);
        this.carAlarmSystem = carAlarmSystem;
        this.vehicleType = vehicleType;
    }

    @Override
    public void assembleAlarmSystem() {
        throw new NotImplementedException();
    }

    @Override
    public void getPartsForAlarmSystem() {
        throw new NotImplementedException();
    }

}
