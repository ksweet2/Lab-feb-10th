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
public class Car extends Vehicle {

    public Car(String drive) {
        super(drive);
    }

    @Override
    public void makeNoise() {
        System.out.println("wahhhhhh");
   }
    @Override
    public void getGas() {
        System.out.println("Filled up with premium fuel.");
    }
    
    
}
