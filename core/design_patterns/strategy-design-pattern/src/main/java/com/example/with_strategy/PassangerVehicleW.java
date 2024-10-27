package com.example.with_strategy;

import com.example.with_strategy.Strategy.NormalDriveStrategy;

public class PassangerVehicleW extends VehicleW{
  public PassangerVehicleW() {
    super(new NormalDriveStrategy());
  }
}
