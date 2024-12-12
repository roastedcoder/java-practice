package parking_lot.VehicleType;

public abstract class Vehicle {
    protected String numberPlate;
    protected VehicleType vehicleType;

    public Vehicle(String numberPlate, VehicleType vehicleType) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }

    public VehicleType getType() {
        return this.vehicleType;
    }

    public String getNumberPlate() {
        return this.numberPlate;
    }
}
