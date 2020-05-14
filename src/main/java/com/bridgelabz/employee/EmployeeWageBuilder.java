package com.bridgelabz.employee;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IsFullTime = 1;
        double empAttendance = Math.floor(Math.random() * 10)%2;
        if (empAttendance == IsFullTime) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee Absent");
        }
    }
}
