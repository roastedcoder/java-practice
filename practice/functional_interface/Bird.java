package practice.functional_interface;

@FunctionalInterface
public interface Bird {
  void canFly(); // public abstract void canFly(); is same

  default String getHeight() {
    return "Flying 1000 mtr";
  }

  static String canEat() {
    return "Yes";
  }

  String toString();
}
