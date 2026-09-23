/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem3;



/**
 *
 * @author User
 */
public class EmployeePayrollMain {
     public static void main(String[] args) {

        // Employee 1
        EmployeePayroll employee1 = new EmployeePayroll("E-001","Catriona Gray","Personal Assistant",45,250);

        // Employee 2
        EmployeePayroll employee2 = new EmployeePayroll("E-002","Stephen Curry","Chief",40,200);

        // Employee 3
        EmployeePayroll employee3 = new EmployeePayroll("E-003","Lebron James","Driver",18,180);

        // Display payroll information
        employee1.displayPayroll();
        employee2.displayPayroll();
        employee3.displayPayroll();
    }
}
