package practice.functional_interface;

// There can be ONLY one abstract method and other 3 are also allowed
@FunctionalInterface // this annotation enforces functional interface
public interface Bird {
  // 4 types:
    // Consumer -> only one argument and no result
    // Supplier -> no argument but produce a result
    // Function -> only 1 arg and produce a result
    // Predicate -> only 1 arg and return boolean

  void canFly(); // public abstract void canFly(); is same

  default String getHeight() {
    return "Flying 1000 mtr";
  }

  static String canEat() {
    return "Yes";
  }

  String toString();
}
