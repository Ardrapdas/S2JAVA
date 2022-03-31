/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import com.sun.media.sound.JARSoundbankReader;

/**
 *
 * @author sjcet
 */
public class Employee {
    int emp_id;
    String emp_name;
    int salary;
    Employee(int a,String b,int c)
    {
      emp_id = a;
      emp_name = b;
      salary = c;
    }
    public void totalsalary()
    {
    int totalsalary = salary+((salary*20)/100);
    System.out.println("totalsalary is:" +totalsalary);
    
}
    
            
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee E = new Employee(8,"riya",10000);
        
        E.totalsalary();
        // TODO code application logic here
    }
    
}
