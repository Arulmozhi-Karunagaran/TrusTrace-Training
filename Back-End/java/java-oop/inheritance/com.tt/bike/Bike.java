package com.tt.bike;
public class Bike {
    private boolean isOn;
    //    private int numberOfWheels;
    private int numberOfGears;
    private int engineCapacity; // cc
    private String typeOfBrake;
    private int currentGear;
    private int currentSpeed;
    public int tempSpeed = 0;
    public int tempGear = 0;
    private final int MAX_SPEED = 50;
    public Bike() {
        System.out.println("Bike class constructor");
        isOn = false;
    }
    public void startBike() {
        isOn = true;
    }
    public void setDetails(int numberOfGears, int engineCapacity, String typeOfBrake) {
        this.numberOfGears = numberOfGears;
        this.engineCapacity = engineCapacity;
        this.typeOfBrake = typeOfBrake;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }
    public String getTypeOfBrake() {
        return typeOfBrake;
    }
    public void increaseSpeed() {
        if(checkBikeStatus()) {
            printStartMessage();
            return;
        }
//        checkBikeStatus() == true ? printStartMessage() : "";

        if(checkSpeed()) {
            tempSpeed += 10;
            tempGear += 1;
            setSpeed(tempSpeed);
        }
//      currentSpeed == MAX_SPEED ? System.out.println("Reached Maximum limit") : this.currentSpeed = this.currentSpeed += 10;
    }
    public void decreaseSpeed() {
        if(checkBikeStatus()) {
            printStartMessage();
            return;
        }
        if(currentSpeed == 0) {
            System.out.println("Speed is already zero");
        }
        else {
            tempSpeed -= 10;
            tempGear -= 1;
            setSpeed(tempSpeed);
            setGear(tempGear);
        }
    }
    public void setGear(int tempGear) {
        this.currentGear = tempGear;
    }
    public int getCurrentGear() {
        return this.currentGear;
    }
    public boolean checkBikeStatus() {
        if(isOn == true) {
            return false;
        }
        return true;
    }
    public void setSpeed(int tempSpeed) {
        this.currentSpeed = tempSpeed;
    }
    public int getSpeed() {
        return this.currentSpeed;
    }
    public void printStartMessage() {
        System.out.println("Start your engine please..");
    }
    public boolean checkSpeed() {
        if (currentSpeed == MAX_SPEED) {
            System.out.println("Reached Maximum limit");
            return false;
        }
        return true;
    }
    public void preferableAt() {
        System.out.println("Preferable for speed as well as comfort..");

    }
}
