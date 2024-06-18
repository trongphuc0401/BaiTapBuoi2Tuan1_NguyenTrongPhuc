package org.fuchs.Bai2;

/**
 * Employee - This class are Employee is super class
 */
public class Employee {
    private String name;
    private long salary;

    public Employee() {}
    public Employee(String name,long salary) {
        this.name = name;
        this.salary = salary;
    }
    public void work() {
        System.out.println("working as an employee!");
    }

    public void getSalary() {
        System.out.println(name+" salary: " + salary);
    }

}
