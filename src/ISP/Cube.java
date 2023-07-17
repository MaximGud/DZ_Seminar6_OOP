package ISP;
//объемный тип фигуры релиазует методы подсчета площади и объема
public class Cube implements Volume, Shape {
  private int edge;

  public Cube(int edge) {
    this.edge = edge;
  }

  @Override
  public double area() {
    return 6 * edge * edge;
  }

  @Override
  public double volume() {
    return edge * edge * edge;
  }
}