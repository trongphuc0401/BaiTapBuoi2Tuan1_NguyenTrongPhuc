package org.fuchs.Bai1;

/**
 * Main - use for Run class
 */
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.speedUp(50);

        Vehicle car = new Car();
        car.speedUp(70);

        Vehicle bicycle = new Bicycle();
        bicycle.speedUp(40);

    }
}