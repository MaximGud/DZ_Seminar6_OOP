package ISP;

public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return 2 * 3.14 * radius;
  }
//удален неиспользуемые метод Volume
  // @Override
  // public double volume() {
  //   throw new UnsupportedOperationException();
  // }
}
