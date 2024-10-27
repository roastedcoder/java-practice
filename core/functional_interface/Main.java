package core.functional_interface;

public class Main {
  public static void main(String[] args) {
    // we can implement FunctionalInterface using 
    // implements or 
    // anonymous class or
    // lambda expression (java 8)


    // Using implements.
    Eagle eagle = new Eagle();
    eagle.canFly();
    System.out.println(eagle.getHeight());
    System.out.println(Bird.canEat());

    // Using anonymous class.
    Bird crow = new Bird() {
      @Override
      public void canFly() {
        System.out.println("Crow implementing bird");
      }

      @Override
      public String toString() {
        return "Crow";
      }
    };

    crow.canFly();
    System.out.println(crow.getHeight());

    // Lambda expresssion
    Bird kite = () -> { // since there will always have only one abstract method 
      // so no need for method name here, also () will contain arguments.
      System.out.println("Kite implementing bird");
    };

    kite.canFly();
    System.out.println(crow.getHeight());
  }
}
