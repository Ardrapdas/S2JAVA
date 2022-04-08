/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex.num;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class ComplexNum {
    int real,img;
    
    ComplexNum(){
    }
    ComplexNum(int realn,int imgn){
        real=realn;
        img=imgn;
    }
    public ComplexNum add(ComplexNum c1,ComplexNum c2){
        ComplexNum c=new ComplexNum();
        c.real=c1.real+c2.real;
        c.img=c1.img+c2.img;
        return c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int real1,img1,real2,img2;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter first number real part:");
        real1=sc.nextInt();
        System.out.println("Enter the first number imaginary part:");
        img1=sc.nextInt();
        System.out.println("Enter second number real part:");
        real2=sc.nextInt();
        System.out.println("Enter the second number imaginary part:");
        img2=sc.nextInt();
        
        ComplexNum c1=new ComplexNum(real1,img1);
        ComplexNum c2=new ComplexNum(real2,img2);
        ComplexNum c3=new ComplexNum();
        
        c3=c3.add(c1,c2);
        
        System.out.println("\ncomplex no 1:"+real1+"+i"+img1);
        System.out.println("\ncomplex no 2:"+real2+"+i"+img2);
        
        System.out.println("\nThe sum of numbers = "+c3.real+"+i"+c3.img);
        
        
        // TODO code application logic here
    }
    
}
