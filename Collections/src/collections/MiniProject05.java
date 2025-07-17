package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniProject05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> items = new ArrayList<>();

		while (true) {
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter the item to be inserted: ");
				String insertItem = sc.nextLine();
				items.add(insertItem);
				System.out.println("Inserted successfully\n");
				break;

			case 2:
				System.out.print("Enter the item to search: ");
				String searchItem = sc.nextLine();
				if (items.contains(searchItem)) {
					System.out.println("Item found in the list.\n");
				} else {
					System.out.println("Item not found in the list.\n");
				}
				break;

			case 3:
				System.out.print("Enter the item to delete: ");
				String deleteItem = sc.nextLine();
				if (items.remove(deleteItem)) {
					System.out.println("Deleted successfully\n");
				} else {
					System.out.println("Item does not exist.\n");
				}
				break;

			case 4:
				if (items.isEmpty()) {
					System.out.println("The list is empty.\n");
				} else {
					System.out.println("The Items in the list are:");
					for (String item : items) {
						System.out.println(item);
					}
					System.out.println();
				}
				break;

			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.\n");
			}
		}
	}
}