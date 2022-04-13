/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpose;
import java.util.Scanner;
/**
 *
 * @author sjcet
 */
public class Transpose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p,q;
        int m[][]=new int[10][10];
        int t[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and colomuns:");
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("enter elements:");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(m[i][j]+"\t");
        }
             System.out.println();
        // TODO code application logic here
    }
         for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                t[i][j]=m[j][i];
    
}
         }
         System.out.println("Transpose of matrix is :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
