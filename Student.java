/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
public class Student {
    int m1,m2,m3;
    float sum;
    Student(int a,int b,int c)
    {
    m1 = a ;
    m2 = b ;
    m3 = c ;
    
    }
    public void sum()
    {
        sum = m1+m2+m3;
     System.out.println("sum  is:" +sum);
    }
    public void percentage(){
        float percentage =(sum / 300)*100;
        System.out.println("percentage is:"+percentage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
    Student S1 = new Student(84,75,70);
    Student S2 = new Student(80,72,66);
    S1.sum();
    S1.percentage();
    S2.sum();
    S2.percentage();
        // TODO code application logic here
    }
    
}
