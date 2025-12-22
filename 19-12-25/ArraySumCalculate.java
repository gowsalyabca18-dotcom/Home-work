/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ArraySumCalculate 
{
    public static ArrayList<Integer>collectNumbers(Scanner sc)
    {
    ArrayList<Integer>numbers=new ArrayList<>();
   
    int num=0;
   
    do
      {
          System.out.println("1for entry | 2 for exit");
          System.out.println("enter your number");
           num=sc.nextInt();
          if (num==1)
          {
              System.out.println("Enter the value:");
              int value=sc.nextInt();
              numbers.add(value);
          }
          else if(num!=2)
          {
              System.out.println("Invalid number.please enter 1 or 2");
          
          }

      }while(num!=2);
    return numbers;
    }
   public static int calculate(ArrayList<Integer>numbers)
   {
      int sum=0;
      for(int num:numbers)
      {
      sum=sum+num;
      }
      return sum;
   } 
      
}
