package test;


import com.automobile.fourwheeler.*;
import com.automobile.twowheeler.*;

public class TestVehicles {
    public static void main(String[] args) {
        Logan logan = new Logan("Logan LX", "DL01AB1234", "John Doe");
        System.out.println("Logan Details:");
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Registration: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.speed());
        logan.gps();
        
        Ford ford = new Ford("Ford EcoSport", "MH01CD5678", "Jane Smith");
        System.out.println("\nFord Details:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Registration: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.speed());
        ford.tempControl();
        
        Hero hero = new Hero("Hero Splendor", "KA01EF9012", "Mike Johnson");
        System.out.println("\nHero Details:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Registration: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();
        
        Honda honda = new Honda("Honda Activa", "TN01GH3456", "Sarah Wilson");
        System.out.println("\nHonda Details:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Registration: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}