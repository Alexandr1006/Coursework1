public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee ("Иванов Иван Иванович", 1, 100000);
        employee[1] = new Employee ("Мишин Михаил Михайлович", 2, 150000);
        employee[2] = new Employee ("Кудрявцева Виктория Викторовна", 3, 20000);
        employee[3] = new Employee ("Петров Петр Анатольевич", 4, 25000);
        employee[4] = new Employee ("Герман Греф Эдуардович", 5, 30000);
        employee[5] = new Employee ("Беляев Владимир Иванович", 1, 35000);
        employee[6] = new Employee ("Костарев Александр Николаевич", 2, 45000);
        employee[7] = new Employee ("Жирков Юрий Валентинович", 3, 50000);
        employee[8] = new Employee ("Дзюба Артем Сергеевич", 4, 55000);
        employee[9] = new Employee ("Головин Александр Сергеевич", 5, 60000);

        EmployeeService.listEmployee(employee);
        EmployeeService.printSumMoney(employee);
        EmployeeService.printMinMoney(employee);
        EmployeeService.printMaxMoney(employee);
        EmployeeService.printAverageSalaryEmployee(employee);
        EmployeeService.nameEmployee(employee);
    }
}