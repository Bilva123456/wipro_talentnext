package com.wipro.automobile.ship;

public class Compartment {
    private double height;
    private double width;
    private double breadth;
    
    public Compartment() {
        this.height = 0.0;
        this.width = 0.0;
        this.breadth = 0.0;
    }
    
    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getBreadth() {
        return breadth;
    }
    
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    
    public double getVolume() {
        return height * width * breadth;
    }
    
    public void displayCompartmentDetails() {
        System.out.println("Compartment Details:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
        System.out.println("Volume: " + getVolume());
    }
}
