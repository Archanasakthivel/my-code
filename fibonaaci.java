/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoding;
import java.util.Scanner;

/**
 *
 * @author SAKTHI ARCHANA
 */
public class fibonaaci {
    public static void main(String args[])
    {
     int a=0,b=1,i,c;
     Scanner s=new Scanner (System.in);
     System.out.println("enter a number");
     int n=s.nextInt();
     System.out.println("the fibonacci series");
     for(i=1;i<=n;i++)
     {
     System.out.print(a+" ");
     c=a+b;
     a=b;
     b=c;
     }
    }
    
}
