package org.fuchs.Bai3;

/**
 * Manager - This class is sublcass of Employee
 *
 * @param
 * @return
 * @throws
 */
public class Manager extends Employee{
    public Manager(String name, String address, double salary, String role, String rank,double bonus) {
        super(name, address, salary, role, rank,bonus);
    }

    public Manager() {
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

    @Override
    public void totalSalaryAndBonus() {
        super.totalSalaryAndBonus();
    }
}
