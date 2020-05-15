package com.bridgelabz.employee;

public class EmployeeWageBuilder {

    public static final int IsFullTime = 2;
    public static final int IsPartTime = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    private static final int NUM_OF_WORKING_DAYS = 5;

    public static void main(String[] args) {
        int employeeHrs = 0;
        int employeeWage = 0;
        int totalWage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            double empAttendance = Math.floor(Math.random() * 10) % 3;
            switch ((int) empAttendance) {
                case IsFullTime:
                    employeeHrs = 8;
                    break;
                case IsPartTime:
                    employeeHrs = 4;
                    break;
                default:
                    employeeHrs = 0;
            }
            employeeWage = employeeHrs * EMP_RATE_PER_HOUR;
            totalWage+= employeeWage;
            System.out.println("Employee wage " + employeeWage);
        }

        System.out.println("Total Employee wage " + totalWage);
    }
}

