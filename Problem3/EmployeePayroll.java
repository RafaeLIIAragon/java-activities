/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem3;

/**
 *
 * @author User
 */
public class EmployeePayroll {
    
     // Private properties
    private String employeeId;
    private String name;
    private String position;
    private double hoursWorked;
    private double hourlyRate;

    // Constructor
    public EmployeePayroll(String employeeId, String name, String position,
                    double hoursWorked, double hourlyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Calculate regular pay
    public double calculateGrossPay() {
        double regularPay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyRate;
        } else {
            regularPay = 40 * hourlyRate;
        }

        return regularPay + calculateOvertimePay();
    }

    // Calculate overtime pay
    public double calculateOvertimePay() {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double overtimeRate = hourlyRate * 1.50;

            return overtimeHours * overtimeRate;
        }

        return 0.00;
    }

    // Calculate deduction
    public double calculateDeduction() {
        double grossPay = calculateGrossPay();

        if (grossPay <= 10000) {
            return grossPay * 0.05;
        } else {
            return grossPay * 0.10;
        }
    }

    // Calculate net pay
    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeduction();
    }

    // Get employee classification
    public String getEmployeeClassification() {
        if (hoursWorked < 20) {
            return "Part-Time";
        } else if (hoursWorked <= 40) {
            return "Regular";
        } else {
            return "Overtime Worker";
        }
    }

    // Display payroll
    public void displayPayroll() {
        double regularPay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyRate;
        } else {
            regularPay = 40 * hourlyRate;
        }

        System.out.println("================== EMPLOYEE PAYROLL ====================");
        System.out.println();
        
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println();
        
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Rate: P%.2f%n", hourlyRate);
        System.out.println();
        
        System.out.printf("Regular Pay: P%.2f%n", regularPay);
        System.out.printf("Overtime Pay: P%.2f%n", calculateOvertimePay());
        System.out.printf("Gross Pay: P%.2f%n", calculateGrossPay());
        System.out.println();
        
        System.out.printf("Deduction: P%.2f%n", calculateDeduction());
        System.out.printf("Net Pay: P%.2f%n", calculateNetPay());
        System.out.println();
        System.out.println("Classification: " + getEmployeeClassification());
        System.out.println();
    }

   
    
}
