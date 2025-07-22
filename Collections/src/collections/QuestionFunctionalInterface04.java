package collections;

import java.util.*;
import java.util.function.Predicate;

class EmployeeFilter {
    private String name;
    private double salary;

    public EmployeeFilter(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class QuestionFunctionalInterface04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeFilter> employees = new ArrayList<>();

        System.out.println("Enter details for 5 employees:");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees.add(new EmployeeFilter(name, salary));
        }

        Predicate<EmployeeFilter> salaryLessThan10K = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        employees.stream()
                .filter(salaryLessThan10K)
                .forEach(emp -> System.out.println(emp.getName()));

        sc.close();
    }
}