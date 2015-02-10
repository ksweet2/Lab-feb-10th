/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.feb.pkg10th;

/**
 *
 * @author Kyle
 */
public class LabFeb10th {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        Vehicle car = new Car();
        
        truck.drive();
        car.drive();
    }
    
}
