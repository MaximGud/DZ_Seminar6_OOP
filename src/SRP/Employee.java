
package SRP;

import java.util.Date;

public class Employee {
  private String name;
  private Date dob;
  private int baseSalary;

  // добавлен метод получения оклада
  public int getBaseSalary() {
    return baseSalary;
  }

  // конструктор Employee
  public Employee(String name, Date dob, int baseSalary) {
    this.name = name;
    this.dob = dob;
    this.baseSalary = baseSalary;
  }

  // метод получения инфо о служащем
  public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
  }

}
