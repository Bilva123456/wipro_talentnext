package com_wipro_automobile_ship;

public class Compartments {
	private double height;
	private double width;
	private double breadth;

	public Compartments(double height, double width, double breadth) {
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
	public void displayDetails() {
        System.out.println("=== Ship Compartment Details ===");
        System.out.println("Height: " + height + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Breadth: " + breadth + " meters");
        System.out.println("Volume: " + getVolume() + " cubic meters");
        System.out.println("=====================================");
    }

	public String toString() {
		return "Ship Compartment - Height: " + height + ", Width: " + width + ", Breadth: " + breadth + ", Volume: "
				+ getVolume();
	}
	public static void main(String []args) {
		
	}
}
