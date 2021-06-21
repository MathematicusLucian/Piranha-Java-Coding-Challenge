package com.piranha;

import src.CentralLockingSystem;

public class Main {

    public static void main(String[] args) {
        AlarmSystem alarmSystem = new CentralLockingSystem("Central Locking");
        AlarmSystem alarmSystem2 = new GearLockingSystem("Gear Locking");
        Vehicle vehicle = new FlashyCar(alarmSystem, "FlashyCar HeavyFoot spec");
        vehicle.getPartsForAlarmSystem();
        vehicle.assembleAlarmSystem();
        vehicle.printStatus();

        System.out.println();

        vehicle = new FlashyCar(alarmSystem2, "FlashCar HeavyFoot spec");
        vehicle.getPartsForAlarmSystem();
        vehicle.assembleAlarmSystem();
        vehicle.printStatus();

        System.out.println("------------------------------------------------------");

        vehicle = new Rustbucket(alarmSystem, "Rustbucket Runabout spec");
        vehicle.getPartsForAlarmSystem();
        vehicle.assembleAlarmSystem();
        vehicle.printStatus();

        System.out.println();

        vehicle = new Rustbucket(alarmSystem2, "Rustbucket Runabout spec");
        vehicle.getPartsForAlarmSystem();
        vehicle.assembleAlarmSystem();
        vehicle.printStatus();
    }

}
