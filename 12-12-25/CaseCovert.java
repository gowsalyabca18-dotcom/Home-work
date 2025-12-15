/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vowel;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class CaseCovert
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in); 
      System.out.println("Enter the String like laptop ");
      String input=sc.nextLine();
        System.out.println("Enter the number 1 or 2");
        int choice=sc.nextInt();
        CaseCovert cc=new CaseCovert();
        System.out.println(cc.convert(input, choice));
        
              
    }
    public String convert(String str,int choice)
    {
    if(choice==1)
    {
    return str.toUpperCase();
    
    }
    else if(choice==2)
    {
    return str.toLowerCase();
    }
    else
    {
    
    return "invalid choice";
     }
    }
 
}
