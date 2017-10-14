package com.qalabs.javabasics;


class Bike {
    protected String brand;
    protected int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    MountainBike(String brand) {
        super(brand);
        this.seatHeight = 0;
    }
    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }
}


class RoadBikee extends Bike{
    RoadBikee (String brand) {
        super(brand);
    }
    public void speedUp() {
        super.speed += 2;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
}

public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike");
        bike.speedUp();

        // Hold mountain bike instance into same bike variable, no problem
        bike = new MountainBike("mountain bike");
        bike.speedUp();

        bike = new RoadBikee( "road bike");
        bike.speedUp();
    }
}
