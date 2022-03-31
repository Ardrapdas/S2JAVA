/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sjcet
 */
public class Rectangle {
    int length, breadth;
    Rectangle (int l,int b){
            length=l;
            breadth=b;
    }
    public void area(){
        int area = length*breadth;
        System.out.println("area is:"+area);
    }
    public void perimeter(){
        int perimeter = 2*(length+breadth);
        System.out.println("perimeter is:"+perimeter);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle R1 =new Rectangle (12,10);
        Rectangle R2 =new Rectangle (8,10);
        R1.area();
        R1.perimeter();
        R2.area();
        R2.perimeter();
        // TODO code application logic here
    }
    
}
