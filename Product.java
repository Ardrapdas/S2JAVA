/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author sjcet
 */
public class Product {
    int pcode;
    String pname;
    int price;
Product(int a,String b,int c){
 pcode=a;
 pname=b;
 price=c;
}
  public int lowest(){
        return price;
  }
  public void display(){
        System.out.println("product code:"+pcode);
        System.out.println("product name:"+pname);
         System.out.println("product code:"+price);
        
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1=new Product(1052,"jams",4300);
        Product p2= new Product(1053,"fruits",5600);
        Product p3=new Product(1054,"ketchup",5700);
        
        if(p1.lowest() < p2.lowest()){
            if(p1.lowest() < p3.lowest()){
              // System.out.println("lowest"+p1.lowest()); 
              System.out.println("Produtc having lowest price :\n");
               p1.display();
                
            }
            else{
               //System.out.println("lowest"+p3.lowest());
                System.out.println("Produtc having lowest price :\n");
              
                p3.display();
            }
        // TODO code application logic here
    }
    
}
