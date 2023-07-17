package OCP;
//добавлен класс Car наследник от Vehicle и реализует метод подсчета скорости
public class Car extends Vehicle implements SpeedCalculation {

  public Car(int maxSpeed, String type) {
    super(maxSpeed, type);

  }

  @Override
  public String toString() {
    return "Car []";
  }

  @Override
  public double calculateAllowedSpeed(Vehicle vehicle) {
    return vehicle.getMaxSpeed() * 0.8;
  }

}
