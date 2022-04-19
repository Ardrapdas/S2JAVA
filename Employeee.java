/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeee;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Employeee {
    int empid,salary;
    String name;
    Employeee()
    {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Employee ID:");
        empid=sc.nextInt();
        System.out.print("Enter the Employee Name:");
        name=sc.next();
        System.out.print("Enter the Salary of Employee:");
        salary=sc.nextInt();
    }
    public void display()
     {
        System.out.println("ID:"+empid);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
    public void getsalary()
    {
        int hra,da;
        if(salary<=10000)
        {
            hra=(salary*8)/100;
            da=(salary*10)/100;
            salary=(salary+hra+da);
        }
        else if(salary<=20000)
        {
            hra=(salary*16)/100;
            da=(salary*20)/100;
            salary=(salary+hra+da);
        }
        else
        {
            hra=(salary*24)/100;
            da=(salary*30)/100;
            salary=(salary+hra+da);
        }
    }
    public void lowest(Employeee[] a,int b)
    {
        int min=a[0].salary;
        String st=a[0].name;
        for(int i=0;i<b;i++)
        {
            if(a[i].salary<min)
            {
                min=a[i].salary;
                st=a[i].name;
            }
        }
        System.out.println("Lowest Paid Employee:" + st);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Employees:");
        int lmt = sc.nextInt();
        lmt = lmt-1;
        Employeee[] emp = new Employeee[lmt];
        for(int i=0;i<lmt;i++)
        {
            emp[i]=new Employeee();
            emp[i].getsalary();
            emp[i].display();
        }
        Employeee e = new Employeee();
        e.lowest(emp,lmt);
    }
        // TODO code application logic here
    }
    

