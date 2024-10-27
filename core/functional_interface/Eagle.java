package core.functional_interface;

public class Eagle implements Bird {

  @Override
  public void canFly() {
    System.out.println("Eagle can fly high!");
  }

  @Override
  public String toString() {
    return "Eagle";
  }
}
