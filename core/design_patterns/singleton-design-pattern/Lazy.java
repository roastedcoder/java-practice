package practice.design_patterns.singleton;

public class Lazy {
  private Lazy() {}

  private static Lazy instance;

  public static Lazy getInstanc() {
    if(instance == null) {
      instance = new Lazy();
    }
    return instance;
  }
}
