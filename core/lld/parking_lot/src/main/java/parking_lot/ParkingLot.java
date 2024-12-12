package parking_lot;

import parking_lot.VehicleType.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<ParkingLevel> levels;
    private static ParkingLot instance;

    private ParkingLot() {
        levels = new ArrayList<>();
    }

    synchronized public static ParkingLot getInstance() {
        if(instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLevel(ParkingLevel level) {
        this.levels.add(level);
    }

    synchronized public boolean parkVehicle(Vehicle vehicle) {
        for(ParkingLevel level: levels) {
            if(level.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked: " + vehicle.getType() + " " + vehicle.getNumberPlate());
                return true;
            }
        }
        System.out.println("Couldn't park vehicle: " + vehicle.getType() + " " + vehicle.getNumberPlate());
        return false;
    }

    synchronized public boolean unparkVehicle(Vehicle vehicle) {
        for(ParkingLevel level: levels) {
            if(level.unparkVehicle(vehicle)) {
                System.out.println("Vehicle un-parked: " + vehicle.getType() + " " + vehicle.getNumberPlate());
                return true;
            }
        }
        System.out.println("Couldn't un-park vehicle: " + vehicle.getType() + " " + vehicle.getNumberPlate());
        return false;
    }

    public void displayLevels() {
        for(ParkingLevel level: levels) {
            System.out.println("Level: " + level.getFloor());
            level.displaySpots();
        }
    }
}
