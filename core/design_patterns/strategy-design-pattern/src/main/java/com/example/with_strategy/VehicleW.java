package com.example.with_strategy;

import com.example.with_strategy.Strategy.DriveStrategy;

public class VehicleW {
  DriveStrategy driveObject;

  VehicleW(DriveStrategy driveObject) {
    this.driveObject = driveObject;
  }

  public String drive() {
    return driveObject.drive();
  }
}
