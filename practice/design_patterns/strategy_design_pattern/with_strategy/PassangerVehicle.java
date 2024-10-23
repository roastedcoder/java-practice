package practice.design_patterns.strategy_design_pattern.with_strategy;

import practice.design_patterns.strategy_design_pattern.with_strategy.Strategy.NormalDriveStrategy;

public class PassangerVehicle extends Vehicle{
  PassangerVehicle() {
    super(new NormalDriveStrategy());
  }
}
