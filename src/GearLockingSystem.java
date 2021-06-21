package com.piranha;

public class GearLockingSystem implements CarAlarmSystem {

    private final String alarmSystemName;

    public GearLockingSystem(String alarmSystemName) {
    }

    @Override
    public String alarmSystemName() {
        throw new NotImplementedException();
    }

    @Override
    public void create() {
        System.out.printlin("REPLACE");
    }

}