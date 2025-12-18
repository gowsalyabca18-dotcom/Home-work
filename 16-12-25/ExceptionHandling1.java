/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepionhandling;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ExceptionHandling1
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int len = Sc.nextInt();
        int ar[]=new int[len];
        
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter the value for "+i+" index : ");
            ar[i]=Sc.nextInt();
        }
        
        System.out.println("Enter the index which value you want to see : ");
        int index = Sc.nextInt();
        
        try
        {
            System.out.println("The value of "+index+" is : "+ar[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Sorry, You entered a wrong array. Please check it.");
        }
        finally
        {
            System.out.println("Thank You...");
        }
    }
    
}
