package LSP;

//создан родительский класс Shape с полями для наследования 
public class Shape {
  protected int width;
  protected int height;

  // конструктор
  public Shape(int width, int height) {
    this.width = width;
    this.height = height;
  }

  // методы сет и гет в родителе
  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
