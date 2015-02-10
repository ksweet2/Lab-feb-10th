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
public class Truck1 implements VehicleInterface {

    public Truck1(String drive, String gas, String noise){
        this.setDrive(drive);
        this.setGas(gas);
        this.setNoise(noise);
    }
    
   
    public String drive(String drive) {
        return drive;
    }

    @Override
    public void setDrive(String drive) {
        System.out.println("Driving your truck.");
    }

    
    public String makeNoise(String noise) {
        return noise;
    }

    @Override
    public void setNoise(String noise) {
        System.out.println("Vroom Vroom");
    }

    public String getGas(String gas) {
        return gas;
    }

    @Override
    public void setGas(String gas) {
        System.out.println("Filled up with diesel fuel.");
    }
    
}
