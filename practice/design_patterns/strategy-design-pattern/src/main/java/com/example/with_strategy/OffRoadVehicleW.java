package com.example.with_strategy;

import com.example.with_strategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicleW extends VehicleW {

    public OffRoadVehicleW() {
        super(new SportsDriveStrategy());
    }
  
}
