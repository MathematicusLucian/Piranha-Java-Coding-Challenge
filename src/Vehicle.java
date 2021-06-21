import com.piranha;

public abstract class Vehicle {
    
    private final CarAlarmSystem carAlarmSystem;
    private final String vehicleType;

    public Vehicle(CarAlarmSystem carAlarmSystem, String vehicleType) {
    }

    public abstract void assembleAlarmSystem();
    public abstract void getPartsForAlarmSystem();

    public void printStatus(){
        System.out.println("REPLACE");
    }

}