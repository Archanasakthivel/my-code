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
public class digit {
    public static void main(String args[])
    {
        int rem,sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the digit");
      int n=s.nextInt();
      while(n>0)
      {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
        
      }
      System.out.println("the sum of digit is :" + sum);
    }
    
}
