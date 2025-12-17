/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalandstatic;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class StaticMain {

    
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int res=MathHelper.squareCalculate(n);
        System.out.println("The Square Value of " + n +"=" +res);
    }
    
}
