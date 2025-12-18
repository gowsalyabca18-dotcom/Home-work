package excepionhandling;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NumberFormatException
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        String input=sc.nextLine();
        try
        {
        int n=Integer.parseInt(input);
            System.out.println(input);
        }
        catch(Exception obj)
        {
            System.out.println("you enter a invalid number; please enter integer number");
        }
        finally
        {
        
            System.out.println("THANK YOU");}
        
    }
}
