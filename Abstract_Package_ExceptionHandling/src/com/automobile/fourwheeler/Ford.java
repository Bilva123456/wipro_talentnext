package com.automobile.fourwheeler;


import com.automobile.Vehicle;

public class Ford extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    private boolean tempControlStatus;
    
    public Ford(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = 0;
        this.tempControlStatus = false;
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
    
    public int tempControl() {
        tempControlStatus = !tempControlStatus;
        if(tempControlStatus) {
            System.out.println("Air conditioning is ON");
            return 1;
        } else {
            System.out.println("Air conditioning is OFF");
            return 0;
        }
    }
}