package org.fuchs.Bai3;

/**
 * Developer - This class is subclass of Employee
 *
 * @param
 * @return
 * @throws
 */
public class Developer extends Employee {
    public Developer(String name, String address, double salary, String role, String rank, double bonus) {
        super(name, address, salary, role, rank,bonus);
    }

    public Developer() {
        super();
    }

    @Override
    public void getBonus() {
        super.getBonus();
    }

    @Override
    public void displayActivities() {
        super.displayActivities();
    }

    @Override
    public void reportPerformance() {
        super.reportPerformance();
    }

    @Override
    public void totalSalaryAndBonus() {
        super.totalSalaryAndBonus();
    }
}
