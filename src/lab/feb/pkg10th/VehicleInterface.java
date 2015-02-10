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
public interface VehicleInterface {
    public static final int MAX_AGE = 100;
    public static final int MIN_AGE = 0;
    public abstract String drive();
    public abstract void setDrive(String drive);
    public abstract String makeNoise();
    public abstract void setNoise(String noise);
    public abstract String getGas();
    public abstract void setGas(String gas);
    
}
