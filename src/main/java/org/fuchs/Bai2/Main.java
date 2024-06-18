package org.fuchs.Bai2;

/**
 * Main - use for Run class
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Employee",4000);
        employee.work();
        employee.getSalary();
        System.out.println("");

        HRManager employeeManager = new HRManager("Manager",7000);
        employeeManager.work();
        employeeManager.getSalary();
        System.out.println("");

        employeeManager.addEmployee();
    }
}
