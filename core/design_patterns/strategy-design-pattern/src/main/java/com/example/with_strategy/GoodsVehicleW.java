package com.example.with_strategy;

import com.example.with_strategy.Strategy.NormalDriveStrategy;

public class GoodsVehicleW extends VehicleW {

    public GoodsVehicleW() {
        super(new NormalDriveStrategy());
    }
  
}
