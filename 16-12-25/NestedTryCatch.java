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
public class NestedTryCatch
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the first number");
            int num1=sc.nextInt();
            System.out.println("Enter the second number");
            int num2=sc.nextInt();
            int result=num1/num2;
            System.out.println("The Result is: " + result);
            try
            {
                System.out.print("Enter the Array length:");
                int length=sc.nextInt();
                int ar[]=new int[length];
                for(int i=0;i<ar.length;i++)
                {
                    System.out.println("Enter the " + i +" index value is: " );
                    ar[i]=sc.nextInt();
                    System.out.println("Enter the index number between 0 to ar.length-1");
                    int index=sc.nextInt();
                    System.out.println("Value at index " +index+":"+ar[index]);
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
                {
            System.out.println("the index you enter is invalid.please enter correct number");
                 }
        }
            catch(ArithmeticException obj)
            {
                System.out.println("Please enter the valid number");
            }
        finally
        {
            System.out.println("THANK YOU");
        }
    
    }
    
    }
 
}
