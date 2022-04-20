/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;
class Vehicle {
  protected String brand = "Ford";        
  public void honk() {                    
    System.out.println("Tuut, tuut!");
  }
}

/**
 *
 * @author sjcet
 */
public class Car extends Vehicle{
    private String modelName = "Mustang";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myCar = new Car();
       myCar.honk();
       System.out.println(myCar.brand + " " + myCar.modelName);
        // TODO code application logic here
    }
    
}
