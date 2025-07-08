package oops;
import java.util.Scanner;

class Box {
    private double width;
    private double height;
    private double depth;
    
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double getVolume() {
        return width * height * depth;
    }
}

public class QuestionClass01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter box dimensions (width height depth): ");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double depth = scanner.nextDouble();
        
        Box box = new Box(width, height, depth);
        System.out.println("Box volume: " + box.getVolume());
        
        scanner.close();
    }
}