/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu;

/**
 *
 * @author sjcet
 */
public class CPU 
{
     double price;
      class Processor{
     double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }
      protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }

 

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
       CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
 CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}

        // TODO code application logic here
    
    

