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
public class ThrowAndThrows
{
    public static void main(String[] args) throws Exception 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any number to check it is valid or not : "); 
        int num = Sc.nextInt();
        
        
        if(num>0)
        {
            System.out.println(num+" is a valid Number");
        }
        else if(num==0)
        {
            System.out.println(num+" is a neutral Number");
        }
        else
        {
            throw new Exception("Sorry, You entered a invalid number..");
        }
    }
  
}
