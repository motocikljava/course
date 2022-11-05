public class EmployeeMet {
    Employee[] Met;

    public EmployeeMet(int size) {
        this.Met = new Employee[size];
    }

    public void addEmployeeMet(String name, int department, double cash) {
        for (int i = 0; i < Met.length; i++) {
            if (Met[i] == null) {
                Met[i] = new Employee(name, department, cash);
                return;
            }
        }
    }

    public double findAllCashMonth() {
        double sum = 0;
        for (int i = 0; i < Met.length; i++) {
            sum += Met[i].getCashe();
        }
        return sum;
    }

    public double findAveregeCash() {
        double averageSalary = 0;
        for (int i = 0; i < Met.length; i++) {
            averageSalary += Met[i].getCashe() / Met.length;
        }
        return averageSalary;
    }

    public double findMaxCash() {
        double maxCash = 0;
        for (int i = 0; i < Met.length; i++) {
            if (Met[i].getCashe() > maxCash) {
                maxCash = Met[i].getCashe();
            }
        }
        return maxCash;
    }public double findMinCash() {
        double minCash = 0;
        for (int i = 0; i < Met.length; i++) {
            if (Met[i].getCashe() < Met[0].getCashe() - 1) {
                minCash = Met[i].getCashe();
            }

        }
        return minCash;
    }

    public void printEmployee() {
        for (int i = 0; i < Met.length; i++) {
            if (Met != null) {
                System.out.println(Met[i].toString());
            }
        }
    }

    public void officeName() {
        for (int i = 0; i < Met.length; i++) {
            System.out.println(Met[i].getName());
        }

    }
    public void separator() {
        System.out.println("=========================================================================");
    }

}


