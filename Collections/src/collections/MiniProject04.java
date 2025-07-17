package collections;



import java.util.*;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Box) {
            Box b = (Box) obj;
            return Double.compare(this.getVolume(), b.getVolume()) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Double.valueOf(getVolume()).hashCode();
    }

    public String toString() {
        return String.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f",
                length, width, height, getVolume());
    }
}

public class MiniProject04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> boxSet = new LinkedHashSet<>();

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.println("Enter Length");
            double length = sc.nextDouble();
            System.out.println("Enter Width");
            double width = sc.nextDouble();
            System.out.println("Enter Height");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);
            if (!boxSet.add(box)) {
                System.out.println("Box with same volume already exists. Not adding this box.");
            }
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box b : boxSet) {
            System.out.println(b);
        }

        sc.close();
    }
}