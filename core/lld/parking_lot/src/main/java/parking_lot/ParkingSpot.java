package parking_lot;

import parking_lot.VehicleType.Vehicle;
import parking_lot.VehicleType.VehicleType;

import java.util.List;

public class ParkingSpot {
    private Vehicle parkedVehicle;
    private final int id;
    private final VehicleType spotType;

    public ParkingSpot(int id, VehicleType spotType) {
        this.id = id;
        this.spotType = spotType;
    }

    public VehicleType getSpotType() {
        return this.spotType;
    }

    public boolean available() {
        return parkedVehicle == null;
    }

    synchronized public boolean parkVehicle(Vehicle vehicle) {
        if (available() && vehicle.getType() == this.spotType) {
            this.parkedVehicle = vehicle;
            return true;
        }
        return false;
    }

    synchronized public boolean unparkVehicle(Vehicle vehicle) {
        if(parkedVehicle == vehicle) {
            this.parkedVehicle = null;
            return true;
        }
        return false;
    }

    public Vehicle getParkedVehicle() {
        return this.parkedVehicle;
    }
}
