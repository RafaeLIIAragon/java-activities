/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem5;

/**
 *
 * @author User
 */
public class InternetPlan {
    
    // Private attributes - Encapsulation
    private String planCode;
    private String customerName;
    private double monthlyFee;
    private int monthsSubscribed;

    // Constructor
    public InternetPlan(String planCode, String customerName,
                        double monthlyFee, int monthsSubscribed) {
        this.planCode = planCode;
        this.customerName = customerName;
        this.monthlyFee = monthlyFee;
        this.monthsSubscribed = monthsSubscribed;
    }

    // Getters
    public String getPlanCode() {
        return planCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public int getMonthsSubscribed() {
        return monthsSubscribed;
    }

    // Setters
    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void setMonthsSubscribed(int monthsSubscribed) {
        this.monthsSubscribed = monthsSubscribed;
    }

    // Methods to be overridden
    public double calculateMonthlyBill() {
        return monthlyFee;
    }

    public String getSpeed() {
        return "Unknown";
    }

    public String getPlanDescription() {
        return "Internet Plan";
    }

    // Determines discount percentage
    public double getDiscountRate() {
        return 0.0;
    }

    // Determines customer classification
    public String getClassification() {
        if (monthsSubscribed >= 12) {
            return "LONG-TERM SUBSCRIBER";
        } else {
            return "REGULAR SUBSCRIBER";
        }
    }
}
    

