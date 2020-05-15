package com.bridgelabz.employee;

public class EmployeeWageBuilder {

    public static final int IsFullTime = 2;
    public static final int IsPartTime=1;

    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int employeeHrs = 0;
        int employeeWage = 0;
         double empAttendance = Math.floor(Math.random() * 10) % 3;
        switch((int)empAttendance) {
            case IsFullTime:
                employeeHrs = 8;
                break;
            case IsPartTime:
                employeeHrs = 4;
                break;
        }
        employeeWage = employeeHrs * EMP_RATE_PER_HOUR;
         System.out.println("Employee wage "+employeeWage);
        }
    }

