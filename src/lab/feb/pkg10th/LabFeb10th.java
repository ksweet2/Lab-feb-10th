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

 
    public static void main(String[] args) {
        Vehicle truck = new Truck("driving");
        Vehicle car = new Car("driving");
        
        truck.makeNoise();
        car.makeNoise();
        
        truck.getGas();
        car.getGas();
        
        
        //good things: it was easy to implement the methods to my subclass once
        //it was written because I had the general idea of what i wanted to
        //do with those methods. a truck and a car have different ways of implementing
        //them however, with an abstract class you can provide some default code,
        //but in this case i didnt because a car and a truck are so different
        //I was able to use the liskov substitution principle, the idea that you
        //can call the super class when making a new object without the program
        //breaking. 
        
        //bad things: cant have multiple inheritance
        
        VehicleInterface truck1 = new Truck1("","","");
        VehicleInterface car1 = new Car1("","","");
        
        truck1.makeNoise();
        car1.makeNoise();
        
        truck1.getGas();
        car1.getGas();
        
        truck1.drive();
        car1.drive();
        
        
        //good things: i was able to easily write the super class, and the subclasses
        //implmementing it i was able to control 100% and try to make them as flexible
        //and secure as possible
        
        
        //bad things: wasnt sure whether or not to make the subclasses abstract,
        //kept giving me an error that the subclass wasnt abstract and it didnt 
        //override the getgas method in my interface super class, wasnt able to
        //successfully run it.
        
    }
    
}
