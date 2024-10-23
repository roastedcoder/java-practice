package practice.design_patterns.strategy_design_pattern.with_strategy;

import practice.design_patterns.strategy_design_pattern.with_strategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
  
}
