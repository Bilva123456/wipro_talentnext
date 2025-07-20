package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Logan extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    
    public Logan(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = 0;
    }
    
    public String getModelName() {
        return modelName;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public int speed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int gps() {
        System.out.println("GPS is now active");
        return 1;
    }
}
