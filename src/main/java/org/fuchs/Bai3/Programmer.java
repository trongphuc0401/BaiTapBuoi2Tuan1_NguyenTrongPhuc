package org.fuchs.Bai3;

/**
 * Programmer - Thís class is subclass of Employee
 *
 * @param
 * @return
 * @throws
 */
public class Programmer extends Employee {
    public Programmer(String name, String address, double salary, String role, String rank,double bonus ) {
        super(name, address, salary, role, rank,bonus);
    }

    public Programmer() {
        super();
    }

    @Override
    public void getBonus() {
        super.getBonus();
    }

    @Override
    public void reportPerformance() {
        super.reportPerformance();
    }

    @Override
    public void displayActivities() {
        super.displayActivities();
    }
}
