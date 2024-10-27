package practice.design_patterns.singleton;

public class Synchronized {
  private Synchronized() {}

  private static Synchronized instance;

  synchronized public static Synchronized getInstanc() { // synchronized will make it thread safe.
    if(instance == null) {
      instance = new Synchronized();
    }
    return instance;
  }
}
