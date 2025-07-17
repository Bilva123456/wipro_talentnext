package collections;


import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

class EmployeeRegister {
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    public EmployeeRegister(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
public class MiniProject03 {

	    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Employees:");
int n = sc.nextInt();
sc.nextLine();

TreeSet<EmployeeRegister> employees = new TreeSet<>(Comparator.comparing(EmployeeRegister::getFirstName));

for (int i = 1; i <= n; i++) {
System.out.println("Enter Employee " + i + " Details:");

System.out.print("Enter the Firstname: ");
String firstName = sc.nextLine();

System.out.print("Enter the Lastname: ");
String lastName = sc.nextLine();

System.out.print("Enter the Mobile: ");
String mobile = sc.nextLine();

System.out.print("Enter the Email: ");
String email = sc.nextLine();

System.out.print("Enter the Address: ");
String address = sc.nextLine();

employees.add(new EmployeeRegister(firstName, lastName, mobile, email, address));
}

System.out.println("\nEmployee List:");
System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");

for (EmployeeRegister emp : employees) {
System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                emp.getFirstName(), emp.getLastName(), emp.getMobile(), emp.getEmail(), emp.getAddress());
    }

    sc.close();
}
}

