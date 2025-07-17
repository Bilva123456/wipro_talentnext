package io_streams;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Date dateOfBirth;
	private String department;
	private String designation;
	private double salary;

	public Employee() {
	}

	public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayEmployee() {
		System.out.println("Name: " + name);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}
}

public class QuestionSerialization01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Department: ");
		String department = sc.nextLine();

		System.out.print("Enter Designation: ");
		String designation = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		Date dob = new Date();

		Employee emp = new Employee(name, dob, department, designation, salary);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
			oos.writeObject(emp);
			System.out.println("\nEmployee object has been serialized to 'data' file.");
		} catch (IOException e) {
			System.out.println("Serialization error: " + e.getMessage());
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
			Employee deserializedEmp = (Employee) ois.readObject();
			System.out.println("\nDeserialized Employee details:");
			deserializedEmp.displayEmployee();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Deserialization error: " + e.getMessage());
		}

		sc.close();
	}
}
