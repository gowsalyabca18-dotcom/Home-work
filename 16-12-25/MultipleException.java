/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MultipleException
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---Part1:Arithmatic Exception Handling");
        try{
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        int output=num1/num2;
            System.out.println("the output is:" + output);
        }
        catch(ArithmeticException obj)
        {
                    System.out.println("Please enter the correct number"); 
        }
        catch(InputMismatchException e)
        {
            System.out.println("please enter valid integer for divition");
        }
        finally
        {
            System.out.println("THANK YOU");    
         }
        System.out.println("\n----Part2:Array Access Handling---");
        System.out.println("Enter the array length");
        int length=sc.nextInt();
        int ar[]=new int[length];
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("Enter the " +i+"index number is:");
            ar[i]=sc.nextInt();
            System.out.println();
        }
        try
        {
            System.out.println("Enter the index number between 0 and length-1");
            int index=sc.nextInt();
            System.out.println("Value at index " +index+":"+ar[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("the index you enter is invalid.please enter correct number");
        }
        finally
        {
            System.out.println("THANK YOU");
        }
    }
}
