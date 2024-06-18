package org.fuchs.Bai4;

/**
 * Vehicle -
 *
 * @param
 * @return
 * @throws
 */
public class Vehicle {
    private String name;
    private String type;
    private double gas;
    private double distance;
    private double speed;

    public Vehicle(){}

    public Vehicle(String name, String type, double gas, double distance, double speed) {
        this.name = name;
        this.type = type;
        this.gas = gas;
        this.distance = distance;
        this.speed = speed;
    }

    public void getName() {
        System.out.println(type+" Model:"+ " "+name);
    }

    public void getFuel() {
        System.out.println("Fuel Efficiency:"+gas+" mpg");
    }

    public void getDistance() {
        System.out.println("Distance Traveled: "+distance + " miles");
    }
    public void getSpeed() {
        System.out.println("Max Speed: "+speed + " mph");
    }
    public void calculateFuelConsume() {
        double total;
        total = gas*distance;
        System.out.println("Fuel Consume: "+total);

    }
}
