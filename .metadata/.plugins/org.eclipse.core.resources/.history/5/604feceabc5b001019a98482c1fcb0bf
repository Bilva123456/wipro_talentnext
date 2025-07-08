package oops;

import java.util.Scanner;

class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating " + name + " with " + taste + " taste");
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Apple is crunchy and " + taste);
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Orange is juicy and " + taste);
    }
}

public class QuestionOverriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Choose a fruit:");
            System.out.println("1. Apple");
            System.out.println("2. Orange");
            System.out.print("Enter your choice (1 or 2): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\nApple eating:");
                    Apple apple = new Apple("Apple", "sweet", "medium");
                    apple.eat();
                    break;
                    
                case 2:
                    System.out.println("\nOrange eating:");
                    Orange orange = new Orange("Orange", "tangy", "large");
                    orange.eat();
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}