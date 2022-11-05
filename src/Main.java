import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        EmployeeMet employeeCreate = new EmployeeMet(10);
        employeeCreate.addEmployeeMet("Ivanov Ivan Ivanovich", 1, 29_000);
        employeeCreate.addEmployeeMet("Ezenshtein Chritofor Svetoforovich", 3, 28_000);
        employeeCreate.addEmployeeMet("Nizshe Fridrich Ubermenovich", 5, 22_000);
        employeeCreate.addEmployeeMet("Targarien Deineris Aerysovna", 4, 21_000);
        employeeCreate.addEmployeeMet("Mishkin  Algernon Flowersovich", 4, 20_000);
        employeeCreate.addEmployeeMet("Popitov Simpl Dimplovich", 5, 12_000);
        employeeCreate.addEmployeeMet("Maria Skłodowska-Curie", 3, 18_000);
        employeeCreate.addEmployeeMet("Telepuzikova LaaLaa", 1, 45_000);
        employeeCreate.addEmployeeMet("Blake Daphne Scooby-Doomovna", 2, 29_000);
        employeeCreate.addEmployeeMet("Potratilova Chasvremeni Naimenamovna", 1, 35_000);
        String s = "{0} заплата сострудников составляет {1} рублей";
        String cashMonth = MessageFormat.format(s,"Суммарная",  employeeCreate.findAllCashMonth());
        System.out.println(cashMonth);
        employeeCreate.separator();
        String averageCash = MessageFormat.format(s,"Средняя", employeeCreate.findAveregeCash());
        System.out.println(averageCash);
        employeeCreate.separator();
        String s2 = "{0} зарплата сотрудника составляет {1} рублей";
        String maxCash = MessageFormat.format(s2, "Максимальная", employeeCreate.findMaxCash());
        System.out.println(maxCash);
        employeeCreate.separator();
        String minCash = MessageFormat.format(s2, "Минимальная", employeeCreate.findMinCash());
        System.out.println(minCash);
        employeeCreate.separator();
        System.out.println("Все данные о сотрудниках компании: ");
        employeeCreate.printEmployee();
        employeeCreate.separator();
        System.out.println("список Ф.И.О. сотрудников: ");
        employeeCreate.officeName();

    }


}

