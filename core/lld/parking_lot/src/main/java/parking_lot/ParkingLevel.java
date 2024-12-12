package parking_lot;

import parking_lot.VehicleType.Vehicle;
import parking_lot.VehicleType.VehicleType;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.ceil;

public class ParkingLevel {
    private final List<ParkingSpot> parkingSpots;
    private final int floor;

    public ParkingLevel(int floor, int spotCount) {
        this.parkingSpots = new ArrayList<>();
        this.floor = floor;

        int bikeSpotCount = (int)ceil(0.5 * spotCount);
        int carSpotCount = (int)ceil(0.4 * spotCount);

        System.out.println("Bike: " + bikeSpotCount + ", Car: " + carSpotCount);

//        Create empty spots for the level
        for(int i = 0; i<bikeSpotCount; i++) {
            parkingSpots.add(new ParkingSpot(i + 1, VehicleType.BIKE));
        }
        for(int i = bikeSpotCount; i < bikeSpotCount + carSpotCount; i++) {
            parkingSpots.add(new ParkingSpot(i + 1, VehicleType.CAR));
        }
        for(int i = bikeSpotCount + carSpotCount; i < spotCount; i++) {
            parkingSpots.add(new ParkingSpot(i + 1, VehicleType.TRUCK));
        }
    }

    synchronized public boolean parkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(parkingSpot.getSpotType() == vehicle.getType() && parkingSpot.available()) {
                if (parkingSpot.parkVehicle(vehicle)) return true;
            }
        }
        return false;
    }

    synchronized public boolean unparkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(parkingSpot.getParkedVehicle() == vehicle && !parkingSpot.available() && parkingSpot.unparkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public void displaySpots() {
        for(ParkingSpot parkingSpot: parkingSpots) {
            System.out.println(parkingSpot.getSpotType() + " Spot available: " + parkingSpot.available());
        }
    }

    public int getFloor() {
        return this.floor;
    }
}
