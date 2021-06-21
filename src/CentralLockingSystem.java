package com.piranha;

public class CentralLockingSystem implements CarAlarmSystem {
    
    private final String alarmSystemName;

    public CentralLockingSystem(String alarmSystemName) {
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