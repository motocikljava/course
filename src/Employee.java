public class Employee {
String name;
int department;
double cash;
static int counter;
final int id;

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

    public Employee(String name, int department, int cash, int counter) {
    this.name = name;
    this.cash = cash;
    this.department = department;
    id = ++counter;


}
}
