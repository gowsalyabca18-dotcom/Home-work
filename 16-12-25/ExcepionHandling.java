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
public class ExcepionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = Sc.nextInt();
        
        System.out.println("Enter the second number : ");
        int num2 = Sc.nextInt();
        
        
        try
        {
            int output = num1/num2;
            System.out.println(output);
        }
        catch(ArithmeticException obj)
                {
                    System.out.println("Sorry, You entered a wrong number. Please check it.");
                }
        finally
        {
            System.out.println("Thank You");
        }
        
    
    }
    
}
