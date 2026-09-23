/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem2;

/**
 *
 * @author User
 */
public class WaterBill_Main {
    
      public static void main(String[] args) {

        // WaterBill object 1
        WaterBill customer1 = new WaterBill("W-1001", "Nikola Tesla","Residential",250,350);
        
         // WaterBill object 2
        WaterBill customer2 = new WaterBill("W-1002", "Richrad Julve","Residential",150,175);
        
         // WaterBill object 3
        WaterBill customer3 = new WaterBill("W-1003", "Albert Enstien","Residential",110,125);
        
         // Display bills
        customer1.displayBill();
        customer2.displayBill();
        customer3.displayBill();
       
    }
    
}
