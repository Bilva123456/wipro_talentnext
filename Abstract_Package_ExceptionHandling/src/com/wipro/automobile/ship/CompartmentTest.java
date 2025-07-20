package com.wipro.automobile.ship;

public class CompartmentTest {
    public static void main(String[] args) {
        Compartment comp1 = new Compartment();
        comp1.setHeight(10.5);
        comp1.setWidth(8.0);
        comp1.setBreadth(12.0);
        comp1.displayCompartmentDetails();
        
        Compartment comp2 = new Compartment(15.0, 10.0, 8.5);
        comp2.displayCompartmentDetails();
    }

}
