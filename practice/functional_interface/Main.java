package practice.functional_interface;

public class Main {
  public static void main(String[] args) {
    // we can implement FunctionalInterface using 
    // implements or 
    // anonymous class


    // Using implements.
    Eagle eagle = new Eagle();
    eagle.canFly();
    System.out.println(eagle.getHeight());
    System.out.println(Bird.canEat());

    // Using anonymous class.
    Bird crow = new Bird() {
      @Override
      public void canFly() {
        System.out.println("Crow can't fly high!");
      }

      @Override
      public String toString() {
        return "Crow";
      }
    };

    crow.canFly();
    System.out.println(crow.getHeight());
    System.out.println(Bird.canEat());
  }
}
