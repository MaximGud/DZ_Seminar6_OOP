package SRP;

//метод подсчета оклада без налогов
public class CalculateNetSalary {
  public int calculateNetSalary(Employee person) {

    int tax = (int) (person.getBaseSalary() * 0.25);// calculate in otherway
    return person.getBaseSalary() - tax;
  }
}
