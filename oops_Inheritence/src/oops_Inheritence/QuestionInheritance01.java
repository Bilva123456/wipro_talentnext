package oops_Inheritence;

import java.util.Scanner;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird is eating seeds");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping in nest");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class QuestionInheritance01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an option:");
        System.out.println("1. Animal");
        System.out.println("2. Bird");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("\nAnimal object:");
                Animal animal = new Animal();
                animal.eat();
                animal.sleep();
                break;
                
            case 2:
                System.out.println("\nBird object:");
                Bird bird = new Bird();
                bird.eat();
                bird.sleep();
                bird.fly();
                break;
                
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
        }
        
        scanner.close();
    }
}