package practice.design_patterns.strategy_design_pattern.with_strategy;

import practice.design_patterns.strategy_design_pattern.with_strategy.Strategy.DriveStrategy;

public class Vehicle {
  DriveStrategy driveObject;

  Vehicle(DriveStrategy driveObject) {
    this.driveObject = driveObject;
  }

  public String drive() {
    return driveObject.drive();
  }
}
