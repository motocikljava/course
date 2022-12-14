import java.util.Objects;

public class Employee {
private String name;
private int department;
private double cash;
private static int counter;
private final int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.cash, cash) == 0 && id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, cash, id);
    }

    @Override
    public String toString() {
        return "Имя сотрудника ='" + name + '\'' +
                ", отдел № = " + department +
                ", зарплата = " + cash +
                ", id- " + id +
                '}';
    }
    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getCashe() {
        return cash;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public Employee(String name, int department, double cash) {
    this.name = name;
    this.cash = cash;
    this.department = department;
    id = ++counter;


}
}
