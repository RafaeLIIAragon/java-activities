/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem4;


/**
 *
 * @author User
 */
class Van extends Vehicle {

    public Van(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double cost = 2500 * rentalDays;

        // Driver fee
        cost += 1000;

        return cost;
    }
}