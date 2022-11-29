
public class ServiceListEmployee {


    public static double getSumSalary(Employee[] employeeSum) {
        double sum = 0;
        for (Employee employee : employeeSum) {
            if (employee != null) sum += employee.getSalaryEmployeeMonth();
        }
        System.out.print("Выплата зарплат за месяц сотсавила ");
        return sum;
    }

    public static double searchMaxSalary(Employee[] employeesMaxSalary) {
        double maxSalary = 0;
        for (Employee employee : employeesMaxSalary) {
            if (employee == null){continue;}
            if (maxSalary < employee.getSalaryEmployeeMonth())
                maxSalary = employee.getSalaryEmployeeMonth();
        }

        System.out.print("Самая большая зарплата за месяц в организации ");
        return maxSalary;
    }

    @SuppressWarnings("ConstantConditions")
    public static double searchMinSalary(Employee[] employeesMinSalary)
    {

        double minSalary=1_000_000_000;
        for (Employee employee : employeesMinSalary) {
            if (employeesMinSalary == null) {
                continue;
            }
            if (minSalary > employee.getSalaryEmployeeMonth())
                minSalary = employee.getSalaryEmployeeMonth();
        }
        System.out.print("Самая маленькая зарплата за месяц в организации ");
        return minSalary;
    }

    public static double getAverageSalary(Employee[] employeesAverageSalary) {
        double averageSalary = 0;
        int element = 0;
        for (Employee employee : employeesAverageSalary)
            if (employee != null) {
                element++;
                averageSalary += employee.getSalaryEmployeeMonth();
            }
        averageSalary = averageSalary / element;
        System.out.print("Средняя зарплата за месяц в организации ");
        return averageSalary;
    }


}
