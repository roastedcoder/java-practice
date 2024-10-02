public class Main16 {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 5);
    System.out.println(rectangle.area());
    System.out.println(rectangle.perimeter());

    Circle circle  = new Circle(1);
    System.out.println(circle.area());
    System.out.println(circle.perimeter());

    Triangle triangle  = new Triangle(3, 4, 5);
    System.out.println(triangle.area());
    System.out.println(triangle.perimeter());
  }
}

abstract class Shape {
  abstract double area();
  abstract double perimeter();
}

class Rectangle extends Shape {
  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public double area() {
    return (length * width);
  }

  public double perimeter() {
    return 2 * (length + width);
  }
}

class Circle extends Shape {
  private int radius;
  private final double pi = 3.14;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double area() {
    return pi * radius * radius;
  }

  public double perimeter() {
    return 2 * pi * radius;
  }
}

class Triangle extends Shape {
  private int s1;
  private int s2;
  private int s3;

  public Triangle(int s1, int s2, int s3) {
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  public double area() {
    double s = perimeter() / 2;
    return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
  }

  public double perimeter() {
    return s1 + s2 + s3;
  }
}
