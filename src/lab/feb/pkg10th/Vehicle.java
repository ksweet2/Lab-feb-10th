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
public abstract class Vehicle {
    public String carNoise;
    public int gallonsOfGas;
    public double gasPrice;

    public Vehicle() {
    }
    
    public abstract void drive();
    public abstract void getGas();
    
}
