package LSP;

//класс Треугольник наследуется от Фигура
public class Rectangle extends Shape {

  public Rectangle(int width, int height) {
    super(width, height);

  }

  // метод подсчета площади для треугольника
  public int area() {
    return (this.width * this.height) / 2;

  }
}
