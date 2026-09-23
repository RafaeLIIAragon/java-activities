/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem4;



/**
 *
 * @author User
 */
class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    @Override
    public double calculateRental() {
        double cost = 700 * rentalDays;

        // Helmet fee
        cost += 100;

        return cost;
    }
}

