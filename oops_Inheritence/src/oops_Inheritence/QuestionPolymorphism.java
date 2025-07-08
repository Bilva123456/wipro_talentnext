package oops_Inheritence;

import java.util.Scanner;

class Shape {
	public void draw() {
		System.out.println("Drawing Shape");
	}

	public void erase() {
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape {

	public void draw() {
		System.out.println("Drawing Circle");
	}

	public void erase() {
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape {

	public void draw() {
		System.out.println("Drawing Triangle");
	}

	public void erase() {
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape {
	public void draw() {
		System.out.println("Drawing Square");
	}

	public void erase() {
		System.out.println("Erasing Square");
	}
}

public class QuestionPolymorphism {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose a shape:");
		System.out.println("1. Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Square");
		System.out.println("4. All shapes");

		int choice = sc.nextInt();

		System.out.println("Choose operation:");
		System.out.println("1. Draw");
		System.out.println("2. Erase");
		System.out.println("3. Both");

		int operation = sc.nextInt();

		Shape shape = null;

		switch (choice) {
		case 1:
			shape = new Circle();
			performOperation(shape, operation);
			break;
		case 2:
			shape = new Triangle();
			performOperation(shape, operation);
			break;
		case 3:
			shape = new Square();
			performOperation(shape, operation);
			break;
		case 4:
			System.out.println("Polymorphic behavior:");
			Shape c = new Circle();
			Shape t = new Triangle();
			Shape s = new Square();
			performOperation(c, operation);
			performOperation(t, operation);
			performOperation(s, operation);
			break;
		default:
			System.out.println("Invalid choice");
		}

		sc.close();
	}

	public static void performOperation(Shape shape, int operation) {
		switch (operation) {
		case 1:
			shape.draw();
			break;
		case 2:
			shape.erase();
			break;
		case 3:
			shape.draw();
			shape.erase();
			break;
		default:
			System.out.println("Invalid operation");
		}
	}
}