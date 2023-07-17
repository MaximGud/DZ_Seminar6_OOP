package DIP;
//класс машина получает мотор и реализует метод старт двигателя
public class Car implements StartEngine{
  
  private PetrolEngine engine;

  public Car(PetrolEngine engine) {
    this.engine = engine;
  }

  @Override
  public void start() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'start'");
  }

  
}
