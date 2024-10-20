package practice.singleton;

public class Eager {
  private Eager() {}

  private static Eager instance = new Eager();
  // ^ this will remain in memory even if not being used.

  public static Eager getInstance() {
    return instance;
  }
}
