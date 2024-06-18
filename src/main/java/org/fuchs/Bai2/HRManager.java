package org.fuchs.Bai2;

/**
 * HRManager - This class is subclass of Employee
 */
public class HRManager extends Employee {

    public HRManager() {
        super();
    }

    public HRManager(String name,long salary) {
        super(name,salary);
    }

    @Override
    public void work() {
        System.out.println("Managing employees");
    }

    @Override
    public void getSalary() {
        super.getSalary();
    }

    public void  addEmployee() {
        System.out.println("Adding new employee!");
    }
}
