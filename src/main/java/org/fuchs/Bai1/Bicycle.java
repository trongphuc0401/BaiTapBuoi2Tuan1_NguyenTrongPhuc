package org.fuchs.Bai1;

/**
 * Bicycle - This class is subclass of Vehicle
 *
 * @param
 * @return
 * @throws
 */
public class Bicycle extends Vehicle {

    public Bicycle() {}
    public Bicycle(double speed) {
        super(speed);
    }

    @Override
    public void speedUp(double speed) {
        System.out.println("Bicycle speed: "+ speed+" km/s");
    }
}
