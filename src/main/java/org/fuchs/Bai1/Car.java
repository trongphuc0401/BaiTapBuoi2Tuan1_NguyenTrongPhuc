package org.fuchs.Bai1;

/**
 * Car - This class is subclass of Vehicle
 *
 * @param
 * @return
 * @throws
 */
public class Car extends  Vehicle {
    public Car() {}
    public Car(double speed) {
        super(speed);
    }

    @Override
    public void speedUp(double speed) {
        System.out.println("Car speed: "+ speed+" km/s");
    }
}