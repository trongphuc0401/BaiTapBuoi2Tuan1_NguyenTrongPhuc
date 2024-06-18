package org.fuchs.Bai4;

/**
 * Car -
 *
 * @param
 * @return
 * @throws
 */
public class Car extends Vehicle {
    public Car() {
        super();
    }

    public Car(String name, String type, double gas, double distance, double speed) {
        super(name, type, gas, distance, speed);
    }

    @Override
    public void getName() {
        super.getName();
    }

    @Override
    public void getFuel() {
        super.getFuel();
    }

    @Override
    public void getDistance() {
        super.getDistance();
    }

    @Override
    public void getSpeed() {
        super.getSpeed();
    }
}
