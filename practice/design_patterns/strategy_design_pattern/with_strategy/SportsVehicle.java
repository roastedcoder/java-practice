package practice.design_patterns.strategy_design_pattern.with_strategy;

import practice.design_patterns.strategy_design_pattern.with_strategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
  SportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
