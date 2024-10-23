package practice.design_patterns.strategy_design_pattern.with_strategy.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

  @Override
  public String drive() {
    return "Sports";
  }
}
