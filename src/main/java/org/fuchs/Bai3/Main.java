package org.fuchs.Bai3;

/**
 * Main - Main for run package
 *
 * @param
 * @return
 * @throws
 */
public class Main {
    public static void main(String[] args) {

        Manager manager  = new Manager("Avrol Aroldo","UK",12000.0,"Manager","Excellent",5000);
        Developer developer = new Developer("Iver Dipali","India",7200.0,"Developer","Good",5000);
        Programmer programmer =new Programmer("Yaron Gabriel","US",9120.0,"Programmer","Excellent",5000);

        manager.getBonus();
        developer.getBonus();
        programmer.getBonus();



        manager.reportPerformance();
        developer.reportPerformance();
        programmer.reportPerformance();


        manager.displayActivities();System.out.println(" is managing a project.");
        developer.displayActivities();System.out.println(" is writing code in Java.");
        programmer.displayActivities();System.out.println(" is debugging code in Python.");

        manager.totalSalaryAndBonus();
        developer.totalSalaryAndBonus();
        programmer.totalSalaryAndBonus();
    }
}
