package com.example.with_strategy.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

  @Override
  public String drive() {
    return "Sports";
  }
}
