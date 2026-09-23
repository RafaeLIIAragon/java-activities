/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem5;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

    
      
        InternetPlan[] plans = {
            new BasicPlan("B001", "Peter Parker", 6),
            new StandardPlan("S001", "Steven Roger", 12),
            new PremiumPlan("P001", "Tony Stark", 15)
        };

        System.out.println("=============== INTERNET SUBSCRIPTION ==============");
        System.out.println();

        // Polymorphism
        for (InternetPlan plan : plans) {

            System.out.println("Customer: " + plan.getCustomerName());
            System.out.println("Plan: " + plan.getPlanDescription());
            System.out.println("Speed: " + plan.getSpeed());

            System.out.printf("Monthly Fee: P%,.2f%n", plan.getMonthlyFee());

            System.out.println("Months Subscribed: " + plan.getMonthsSubscribed());

            System.out.printf("Discount: %.0f%%%n", plan.getDiscountRate() * 100);

            System.out.printf("Monthly Bill: P%,.2f%n", plan.calculateMonthlyBill());

            System.out.println("Classification: " + plan.getClassification());

            System.out.println();
        }
    }
}

    

