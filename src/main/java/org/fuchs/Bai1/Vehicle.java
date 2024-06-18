package org.fuchs.Bai1;

/**
 * Vehicle - This class to create Object Vehicle
 */
public class Vehicle {
    private double speed;

    public Vehicle(){};

    public Vehicle (double speed) {
        this.speed = speed;
    }
    public void speedUp( double speed) {
        System.out.println("Vehicle speed: "+ speed+" km/s");
    }
}
