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
public class EndsWithA
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String like Name");
        String input=sc.nextLine();
        EndsWithA a=new EndsWithA();
        if(a.check(input))
        {
            System.out.println("It ends with a");
        }
        else
        {
            System.out.println("Its not ends with a");  
            
        }
    }
    public boolean check(String str)
    {
    return str.toLowerCase().endsWith("a");
    }
 
}
