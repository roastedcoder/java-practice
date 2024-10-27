package practice.w3resource;
public class Main2 {
  public static void main(String[] arge) {
    Dog dog = new Dog("name1", "breed1");
    System.out.println(dog.getName() + " " + dog.getBreed());
    dog.setBreed("breed2");
    dog.setName("name2");

    System.out.println(dog.getName() + " " + dog.getBreed());
  }
}

class Dog {
  private String name;
  private String breed;

  public Dog(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  void setName(String name) {
    this.name = name;
  }

  void setBreed(String breed) {
    this.breed = breed;
  }

  String getName() {
    return name;
  }

  String getBreed() {
    return breed;
  }

}