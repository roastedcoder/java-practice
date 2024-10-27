package practice.w3resource;
public class Main3 {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 5);
    System.out.println("area: " + rectangle.area() + ", " + "perimeter: " + rectangle.perimeter());
  }
}

class Rectangle {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.height = height;
    this.width = width;
  }

  public int area() {
    return width * height;
  }

  public int perimeter() {
    return 2 * (width + height);
  }
}
