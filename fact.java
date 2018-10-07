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
public class fact {
    public static void main(String args[])
    {
        int fact=1,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        for(i=n;i>0;i--)
        {
            fact=fact*i;
            
        }
        System.out.println("the factorial of given number is:"+ fact);
        
    }
    
}
