package com.example.with_strategy;

import com.example.with_strategy.Strategy.SportsDriveStrategy;

public class SportsVehicleW extends VehicleW {
  public SportsVehicleW() {
    super(new SportsDriveStrategy());
  }
}
