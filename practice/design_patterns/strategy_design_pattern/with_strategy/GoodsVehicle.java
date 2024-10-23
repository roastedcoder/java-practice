package practice.design_patterns.strategy_design_pattern.with_strategy;

import practice.design_patterns.strategy_design_pattern.with_strategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
  
}
