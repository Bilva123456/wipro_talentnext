package io_streams;

import java.io.*;
import java.util.*;

public class Project {
	private static final String FILE_NAME = "employees.dat";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMain Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addEmployee(sc);
				break;
			case 2:
				displayAllEmployees();
				break;
			case 3:
				System.out.println("Exiting the System");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private static void addEmployee(Scanner sc) {
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Employee Age: ");
		int age = sc.nextInt();

		System.out.print("Enter Employee Salary: ");
		double salary = sc.nextDouble();

		Employee emp = new Employee(id, name, age, salary);

		List<Employee> employeeList = readEmployeeList();
		employeeList.add(emp);
		writeEmployeeList(employeeList);

		System.out.println("Employee added successfully.");
	}

	private static void displayAllEmployees() {
		List<Employee> employeeList = readEmployeeList();

		if (employeeList.isEmpty()) {
			System.out.println("No employee records found.");
			return;
		}

		System.out.println("\n--- Report ---");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		System.out.println("-- End of Report --");
	}

	private static List<Employee> readEmployeeList() {
		List<Employee> list = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			@SuppressWarnings("unchecked")
			List<Employee> tempList = (List<Employee>) ois.readObject();
			list = tempList;
		} catch (FileNotFoundException e) {

		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error reading employee data: " + e.getMessage());
		}
		return list;
	}

	private static void writeEmployeeList(List<Employee> list) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("Error writing employee data: " + e.getMessage());
		}
	}

	static class Employee implements Serializable {
		private static final long serialVersionUID = 1L;

		int id;
		String name;
		int age;
		double salary;

		public Employee(int id, String name, int age, double salary) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public String toString() {
			return id + " " + name + " " + age + " " + salary;
		}
	}
}