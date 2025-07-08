package oops_Inheritence;

import java.util.Scanner;

class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;
    
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }
    
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public int getYearStarted() {
        return yearStarted;
    }
    
    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }
    
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
    
    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

public class QuestionInheritance02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter annual salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter year started: ");
        int year = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Enter national insurance number: ");
        String insuranceNumber = scanner.nextLine();
        
        Employee employee = new Employee(name, salary, year, insuranceNumber);
        
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
        
        scanner.close();
    }
}