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
    private static final int MAX_AGE = 100;
    private static final int MIN_AGE = 0;
    private String drive;
    

    public Vehicle(String drive) {
        setDrive(drive);
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }
    
    public String drive(){
        return drive;
    }
    
    //made these public abstract because trucks and cars sound different when driving and fill up with different fuel, therfore have their own implmentations
    public abstract void makeNoise();
    public abstract void getGas();
    
}
