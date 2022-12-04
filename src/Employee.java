import java.util.Objects;

public class Employee {

    private final int id;
    private static int count = 1;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        if (checkDepartment(department)) {
            this.department = department;
        }
        this.salary = salary;
        id = count++;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    private boolean checkDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Значение отдела должно быть от 1 до 5.");
        }
        return true;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Индивидуальный номер сотрудника " + id + ", Ф.И.О сотрудника " + fullName + ", отдел " + department + ", зарплата " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Double.compare(employee.salary, salary) == 0 && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, department, salary);
    }
}

