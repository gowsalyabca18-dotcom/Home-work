/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepionhandling;

import java.util.Scanner;
import static javafx.beans.binding.Bindings.not;

/**
 *
 * @author Administrator
 */
public class CustomException 
{
    public static void main(String [] args) throws Exception
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the Age");
        int age=sc.nextInt();
        
        
        if(age>18)
                {
                    System.out.println("Your age is  valid");
                }
        else
        {
            throw new Exception("your age is not valid");
        }
    }
}
