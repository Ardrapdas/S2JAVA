/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checklogincredential;
import java.util.Scanner;
class UsernameException extends Exception{
    public UsernameException (String msg){
        super(msg);
    }
}
class PasswordException extends Exception{
    public PasswordException(String msg){
        super(msg);
    }
}

/**
 *
 * @author sjcet
 */
public class CheckLoginCredential {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String username,password;
        System.out.println("Enter username::");
        username = s.nextLine();
        System.out.println("Enter password::");
        password = s.nextLine();
        int length = username.length();
        try {
   if(length < 6)
    throw new UsernameException("Username must be greater than 6 characters ???");
   else if(!password.equals("hello"))
    throw new PasswordException("Incorrect password\nType correct password ???");
   else
    System.out.println("Login Successful !!!");
  }
  catch (UsernameException u) {
   u.printStackTrace();
  }
  catch (PasswordException p) {
   p.printStackTrace();
  }
  finally {
   System.out.println("The finally statement is executed");
        
        }
        // TODO code application logic here
    }
}
    

