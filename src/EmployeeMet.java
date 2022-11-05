public class EmployeeMet {
    Employee[] met;

    public EmployeeMet(int size) {
        this.met = new Employee[size];
    }

    public void addEmployeeMet(String name, int department, double cash) {
        for (int i = 0; i < met.length; i++) {
            if (met[i] == null) {
                met[i] = new Employee(name, department, cash);
                return;
            }
        }
    }

    public double findAllCashMonth() {
        double sum = 0;
        for (int i = 0; i < met.length; i++) {
            sum += met[i].getCashe();
        }
        return sum;
    }

    public double findAveregeCash() {
        double avevageSalary = 0;
        for (int i = 0; i < met.length; i++) {
            avevageSalary = findAllCashMonth() / met.length;
        }
       return avevageSalary;
    }

    public double findMaxCash() {
        double maxCash = met[0].getCashe();
        for (int i = 0; i < met.length; i++) {
            if (met[i].getCashe() > maxCash) {
                maxCash = met[i].getCashe();
            }
        }
        return maxCash;
    }
    public double findMinCash() {
        double minCash = met[0].getCashe();
        for (int i = 0; i < met.length; i++) {
            if (met[i].getCashe() < minCash - 1) {
                minCash = met[i].getCashe();
            }

        }
        return minCash;
    }

    public void printEmployee() {
        for (int i = 0; i < met.length; i++) {
            if (met != null) {
                System.out.println(met[i].toString());
            }
        }
    }

    public void officeName() {
        for (int i = 0; i < met.length; i++) {
            System.out.println(met[i].getName());
        }

    }
    public void separator() {
        System.out.println("=========================================================================");
    }

}


