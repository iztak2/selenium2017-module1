package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
    void printSpec(String spec);
}

class Tank implements Vehicle {
    private int speed;

    Tank() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("Tank New speed %s", this.speed));
    }
    public void printSpec(String spec){
        System.out.println(String.format("Tank Specifications %s"));
    }
}
class Truck implements Vehicle {
    private int speed;

    Truck() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 5;
        System.out.println(String.format("Truck New speed %s", this.speed));
    }
    public void printSpec(String spec){
//        System.out.println(String.format("Truck Specifications %s");
    }
}


public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
    }
}
