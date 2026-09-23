/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem4;



/**
 *
 * @author User
 */

    class Car extends Vehicle {

    public Car(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double cost = 1500 * rentalDays;

        // 10% discount for rentals of 7 days or more
        if (rentalDays >= 7) {
            cost = cost * 0.90;
        }

        return cost;
    }
}
    

