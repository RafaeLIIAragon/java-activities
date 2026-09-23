/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem4;

/**
 *
 * @author User
 */
public class VRSMain {
    

    public static void main(String[] args) {

        // Vehicle array containing different subclass objects
        Vehicle[] vehicles = {
            new Car("C001", "Toyota", "Vios", 7),
            new Motorcycle("M001", "Honda", "Click 125", 3),
            new Van("V001", "Toyota", "Hiace", 2)
        };

        System.out.println("===== VEHICLE RENTAL =====");
        System.out.println();

        // Polymorphism
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
    
