package OCP;
//добавлен класс Bus наследник от Vehicle и реализует метод подсчета скорости
public class Bus extends Vehicle implements SpeedCalculation {

  public Bus(int maxSpeed, String type) {
    super(maxSpeed, type);

  }

  @Override
  public String toString() {
    return "Bus []";
  }

  @Override
  public double calculateAllowedSpeed(Vehicle vehicle) {
    return vehicle.getMaxSpeed() * 0.6;
  }

}
