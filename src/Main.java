import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employee1 =
                new Employee("Адамович", "Татьяна", "Владимировна",
                        1, 15_000);
        Employee employee2 =
                new Employee("Айду", "Эдуард", "Альфред-Иоханесович",
                        1, 35_000);
       Employee employee3 =
                new Employee("Акопян", "Арсений", "Владимирович",
                        2, 41_000);
        Employee employee4 =
                new Employee("Алексеевский", " Дмитрий", "Владимирович",
                        2, 32_000);
        Employee employee5 =
                new Employee("Курочкин", "Сергей", "Сергеевич",
                        3, 36_500);
        Employee employee6 =
                new Employee("Алёшин", "Владимир", "Владимирович",
                        3, 78_388);
        Employee employee7 =
                new Employee("Дяченко", "Арсений", "Вениаминович",
                        4, 12_400);
        Employee employee8 =
                new Employee("Цинц", "Павел", "Петрович",
                        4, 28_506);
        Employee employee9 =
                new Employee("Гершгорин ", "Роман ", "Александрович",
                        5, 44_555);
        Employee employee10 =
                new Employee("Кановей", "Владимир", "Григорьевич",
                        5, 43_336);


        Employee[] listEmployee = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};
        System.out.println(Arrays.toString(listEmployee));

        System.out.println(ServiceListEmployee.getSumSalary(listEmployee));
        System.out.println(ServiceListEmployee.searchMaxSalary(listEmployee));
        System.out.println(ServiceListEmployee.searchMinSalary(listEmployee));
        System.out.println(ServiceListEmployee.getAverageSalary(listEmployee));
        System.out.println(employee2.getDepartment());
        employee1.setSalaryEmployeeMonth(115000);
        employee2.setDepartment(5); 
    }
}


//THE END