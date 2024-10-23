package com.example.with_strategy.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

  @Override
  public String drive() {
    return "Normal";
  }
}
