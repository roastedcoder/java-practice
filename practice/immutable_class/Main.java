package practice.immutable_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Object> petNames = new ArrayList<>();
    petNames.add("Fluffy");
    petNames.add("Spot");

    Immutable immutable = new Immutable("John", petNames);

    System.out.println("Name: " + immutable.getName());
    System.out.println("Pet Names: " + immutable.getPetNames());
  }
}
