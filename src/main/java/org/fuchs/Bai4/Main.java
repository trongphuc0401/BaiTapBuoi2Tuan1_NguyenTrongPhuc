package org.fuchs.Bai4;

/**
 * Main -
 *
 * @param
 * @return
 * @throws
 */
public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck("Tatra 810 4x4","Truck",8.075659532105526,65.5097512444003,80.0);
        truck.getName();
        truck.getFuel();
        truck.getDistance();
        truck.getSpeed();
        truck.calculateFuelConsume();
        System.out.println("");

        Car car = new Car("Virtus","Car",2.355,14.419665,120.0);
        car.getName();
        car.getFuel();
        car.getDistance();
        car.getSpeed();
        car.calculateFuelConsume();
        System.out.println("");

        Motorbike motorbike = new Motorbike("Warrior 200" , "Motorbike",2.1,4.41,80.0);
        motorbike.getName();
        motorbike.getFuel();
        motorbike.getDistance();
        motorbike.getSpeed();
        motorbike.calculateFuelConsume();
    }

}
