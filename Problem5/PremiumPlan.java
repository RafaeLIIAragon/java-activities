/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem5;

/**
 *
 * @author User
 */

    
class PremiumPlan extends InternetPlan {

    public PremiumPlan(String planCode, String customerName,
                       int monthsSubscribed) {
        super(planCode, customerName, 2499, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        double bill = getMonthlyFee();

        if (getMonthsSubscribed() >= 12) {
            bill = bill * 0.85; // 15% discount
        }

        return bill;
    }

    @Override
    public String getSpeed() {
        return "300 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Premium";
    }

    @Override
    public double getDiscountRate() {
        if (getMonthsSubscribed() >= 12) {
            return 0.15;
        }

        return 0.0;
    }
}
