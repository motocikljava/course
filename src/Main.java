import java.util.Arrays;

public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 2, 29_000, 1);
        employees[1] = new Employee("Ezenshtein Chritofor Svetoforovich", 1, 60_000, 2);
        employees[2] = new Employee("Nizshe Fridrich Ubermenovich", 5, 40_000, 3);
        employees[3] = new Employee("Targarien Deineris Aerysovna", 4, 28_000, 4);
        employees[4] = new Employee("Popitov Simpl Dimplovich", 3, 70_000, 5);
        employees[5] = new Employee("Mishkin  Algernon Flowersovich", 1, 90_000, 6);
        employees[6] = new Employee("Maria Skłodowska-Curie", 3, 210_000, 7);
        employees[7] = new Employee("Telepuzikova LaaLaa", 2, 55_000, 8);
        employees[8] = new Employee("Blake Daphne Scooby-Doomovna", 4, 67_000, 9);
        employees[9] = new Employee("Potratilova Chasvremeni Naimenamovna", 5, 210_100, 10);
        System.out.println("Максимальная зарплата сотрудника составляет " + findMaxCash() + " рублей");
        System.out.println("Суммарно заработная плата всех сотрудников составляет " + findAllCashMonth() + " рублей");
        System.out.println("Средняя заработная плата " + findAverageSalary() + " рублей");
        printEmployee();
        findMaxCash1();
        findMinCash1();
    }

    public static double findAllCashMonth() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getCashe();
        }
        return sum;
    }

    public static double findAverageSalary() {
        double averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getCashe() / employees.length;
        }
        return averageSalary;
    }

    public static double findMaxCash() {
        double maxCash = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCashe() > maxCash) {
                maxCash = employees[i].getCashe();
            }
        }
        return maxCash;
    }

    public static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void findMinCash1() {
        double minCash = 0;
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getCashe() < employees[0].getCashe() - 1 && employees[i] != null) {
                minCash = employees[i].getCashe();
                System.out.println("Минимальная зарплата " + minCash
                        + " рублей " + " у сотрудника " + employees[i].getName()
                + " из отдела № " + employees[i].getDepartment());
            }

    }
    public static void findMaxCash1() {
        double maxCash = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCashe() > employees[0].getCashe() + maxCash && employees[i] != null) {
                maxCash = employees[i].getCashe();

            }
        }


    }
}
