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