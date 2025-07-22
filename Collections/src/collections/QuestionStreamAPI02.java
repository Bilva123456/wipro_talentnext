package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class EmployeeSum {
    int empNo;
    String name;
    int age;
    String location;

    EmployeeSum(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }
}

public class QuestionStreamAPI02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeSum> employees = new ArrayList<>();

        System.out.println("Enter details for employees:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter EmpNo: ");
            int empNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Location: ");
            String location = sc.nextLine();

            employees.add(new EmployeeSum(empNo, name, age, location));
        }

        List<EmployeeSum> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("\nEmployee Sum List (Location Pune):");
        puneEmployees.forEach(emp -> System.out.println(emp.empNo + " " + emp.name + " " + emp.age + " " + emp.location));

        int totalAge = puneEmployees.stream()
                .mapToInt(emp -> emp.age)
                .sum();

        System.out.println("Employee Sum (Total age of employees from Pune): " + totalAge);

        sc.close();
    }
}