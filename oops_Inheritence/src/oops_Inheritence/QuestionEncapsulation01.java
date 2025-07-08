package oops_Inheritence;

import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public char getGender() {
        return gender;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName() {
        return name;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQtyInStock() {
        return qtyInStock;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class QuestionEncapsulation01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();
        
        System.out.print("Enter author email: ");
        String authorEmail = scanner.nextLine();
        
        System.out.print("Enter author gender: ");
        char authorGender = scanner.next().charAt(0);
        scanner.nextLine();
        
        Author author = new Author(authorName, authorEmail, authorGender);
        
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();
        
        System.out.print("Enter book price: ");
        double bookPrice = scanner.nextDouble();
        
        System.out.print("Enter quantity in stock: ");
        int qtyInStock = scanner.nextInt();
        
        Book book = new Book(bookName, author, bookPrice, qtyInStock);
        
        System.out.println("\nBook Details:");
        System.out.println("Name: " + book.getName());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
        System.out.println("Author Details:");
        System.out.println("Name: " + book.getAuthor().getName());
        System.out.println("Email: " + book.getAuthor().getEmail());
        System.out.println("Gender: " + book.getAuthor().getGender());
        
        scanner.close();
    }
}