/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class StringManipulation {
    String str1 ;
    StringManipulation(String s1){
        str1=s1;
    }
    public void StringLength(){
        System.out.println("\n The length of string1 :"+str1.length());
    }
     public void StringConcat(){
        System.out.println("\n Concatenated String 'HELLO':"+(str1.concat("HELLO")));
        
    }
    
    public void charpos(){
        System.out.println("\n Character at position 4 in string1:"+(str1.charAt(3)));
        
    }
    
    public void compare(){
        System.out.println("\n Compare to 'JAVA '"+(str1.compareTo("JAVA")));
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str;
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the String");
        str=sc.nextLine();
        
        StringManipulation s1=new StringManipulation(str);
                s1.StringLength();
                s1.StringConcat();
                s1.charpos();
                s1.compare();
        
        // TODO code application logic here
    }
    
}
