package org.fuchs.Bai3;

/**
 * Employee - This class are superclass of deparment
 *
 */
public class Employee {
    private String name;
    private String address;
    private double salary;
    private double bonus;
    String role;
    private String rank;

    public Employee(String name, String address, double salary, String role, String rank,double bonus) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.role = role;
        this.rank = rank;
        this.bonus = bonus;
    }
    public Employee() {}

    public void getBonus() {
        System.out.println(role+"'s Bonus: "+ "$"+salary);
    }

    public void reportPerformance() {
        System.out.println("Performance report for "+role+ " "+ name +": "+rank);
    }

    public void displayActivities() {
        System.out.print(role +" " + name);
    }

    public void totalSalaryAndBonus() {
        double total;
        total = salary + bonus;
        System.out.println("Total salary and bonus: "+total);
    }
}
