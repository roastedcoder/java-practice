package practice.w3resource;


public class Main1 {
    public static void main(String[] args) {
        Person person = new Person(22, "Suraj");
        System.out.println(person.getAge() + " " + person.getName());
    }
}


class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}