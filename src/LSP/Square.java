package LSP;

//класс Квадрат наследуется от Фигура
public class Square extends Shape {

  public Square(int width, int height) {
    super(width, height);
  }

  // метод подсчета площади для квадрата
  public int area() {
    return this.width * this.height;
  }

}
