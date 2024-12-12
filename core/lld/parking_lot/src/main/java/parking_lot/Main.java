package parking_lot;

import parking_lot.VehicleType.Bike;
import parking_lot.VehicleType.Car;
import parking_lot.VehicleType.Truck;
import parking_lot.VehicleType.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Parking Lot \n");
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new ParkingLevel(1, 2));

        parkingLot.displayLevels();

        System.out.println("______________________________________ \n");

        Vehicle myCar = new Car("0711");
        Vehicle friendBike = new Bike("1234");
        Vehicle friendTruck = new Truck("0000");
        Vehicle myNewCar = new Car("0712");

        parkingLot.parkVehicle(myCar);
        parkingLot.parkVehicle(friendBike);
        parkingLot.parkVehicle(friendTruck);
        parkingLot.parkVehicle(myNewCar);
        parkingLot.unparkVehicle(friendBike);
        parkingLot.parkVehicle(myNewCar);
        parkingLot.unparkVehicle(myCar);
        parkingLot.parkVehicle(myNewCar);
    }
}

/*
STDOUT:

Parking Lot

Bike: 1, Car: 1
Level: 1
BIKE Spot available: true
CAR Spot available: true
______________________________________

Vehicle parked: CAR 0711
Vehicle parked: BIKE 1234
Couldn't park vehicle: TRUCK 0000
Couldn't park vehicle: CAR 0712
Vehicle un-parked: BIKE 1234
Couldn't park vehicle: CAR 0712
Vehicle un-parked: CAR 0711
Vehicle parked: CAR 0712

*/