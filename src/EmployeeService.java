public class EmployeeService {

    public static double sumSalary(Employee[] employee) {
        double sum = 0;
        for (Employee value : employee) {
            if (value != null) {
                sum += value.getSalary();
            }
        }
        return sum;
    }

    public static double minSalary(Employee[] employee) {
        double minSalaryEmployee = 0;
        for (int a = 0; a < employee.length; a++) {
            if (a == 0) {
                minSalaryEmployee = employee[a].getSalary();
            }
            if (employee[a] != null) {
                if (employee[a].getSalary() < minSalaryEmployee) {
                    minSalaryEmployee = employee[a].getSalary();
                }

            }

        }

        return minSalaryEmployee;
    }

    public static double maxSalary(Employee[] employee) {
        double maxSalaryEmployee = 0;
        for (int a = 0; a < employee.length; a++) {
            if (a == 0) {
                maxSalaryEmployee = employee[a].getSalary();
            }
            if (employee[a] != null) {
                if (employee[a].getSalary() > maxSalaryEmployee) {
                    maxSalaryEmployee = employee[a].getSalary();
                }

            }

        }

        return maxSalaryEmployee;
    }

    public static void listEmployee(Employee[] employee) {
        System.out.println("Список все сотрудников: ");
        for (Employee value : employee) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }

    public static double averageSalaryEmployee(Employee[] employee) {
        double averageSalary;
        int countEmployee = 0;
        for (Employee value : employee) {
            if (value != null) {
                countEmployee++;
            }
        }
        averageSalary = sumSalary(employee) / countEmployee;
        return averageSalary;
    }

    public static void nameEmployee(Employee[] employee) {
        for (Employee value : employee) {
            if (value != null) {
                System.out.println(value.getFullName());
            }
        }
    }

    public static void printMinMoney(Employee[] employee) {
        for (Employee value : employee) {
            if (value != null) {
                if (value.getSalary() == minSalary(employee)) {
                    System.out.println("Минимальная зарплата = " + value);
                }
            }
        }
    }

    public static void printMaxMoney(Employee[] employee) {
        for (Employee value : employee) {
            if (value != null) {
                if (value.getSalary() == maxSalary(employee)) {
                    System.out.println("Максимальная зарплата = " + value);
                }
            }

        }
    }

    public static void printSumMoney(Employee[] employee) {
        System.out.println("Сумма зарплат = " + sumSalary(employee));
    }

    public static void printAverageSalaryEmployee(Employee[] employee) {
        System.out.println("Средняя зарплата сотрудника составляет = " + averageSalaryEmployee(employee));
    }

}