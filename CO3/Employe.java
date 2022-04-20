/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author sjcet
 */
public class Employe {
    int id;
    String name;
    public Employe(int i,String n)
    {
        id =i;
        name  =n;
    }
    void show()
    {
        System.out.println(id+" "+name);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employe emp1 = new Employe(1,"Govind");
        Employe emp2 = new Employe(2,"Akash");
        emp1.show();
        emp2.show();
        // TODO code application logic here
    }
    
}
