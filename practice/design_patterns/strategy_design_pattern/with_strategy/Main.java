package practice.design_patterns.strategy_design_pattern.with_strategy;

public class Main {
  public static void main(String[] args) {
    SportsVehicle sv = new SportsVehicle();
    OffRoadVehicle ov = new OffRoadVehicle();
    PassangerVehicle pv = new PassangerVehicle();
    GoodsVehicle gv = new GoodsVehicle();

    System.out.println("SportVehicle drive capabality: " + sv.drive());
    System.out.println("OffRoadVehicle drive capability: " + ov.drive());
    System.out.println("PassangerVehicle drive capability: " + pv.drive());
    System.out.println("GoodsVehicle drive capability: " + gv.drive());
  }
}
