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
public class Truck extends Vehicle {

    public Truck(String drive){
        super(drive);
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Vroom Vroom");
    }

    @Override
    public void getGas() {
        System.out.println("Filled up with diesel fuel.");
    }
    public String drive(String drive){
        return drive;
    }
}
