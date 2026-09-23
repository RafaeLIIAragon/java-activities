/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem5;

/**
 *
 * @author User
 */

    class BasicPlan extends InternetPlan {

    public BasicPlan(String planCode, String customerName,
                     int monthsSubscribed) {
        super(planCode, customerName, 999, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        double bill = getMonthlyFee();

        if (getMonthsSubscribed() >= 6) {
            bill = bill * 0.95; // 5% discount
        }

        return bill;
    }

    @Override
    public String getSpeed() {
        return "50 Mbps";
    }

    @Override
    public String getPlanDescription() {
        return "Basic";
    }

    @Override
    public double getDiscountRate() {
        if (getMonthsSubscribed() >= 6) {
            return 0.05;
        }

        return 0.0;
    }
}
    

