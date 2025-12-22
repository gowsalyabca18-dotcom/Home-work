/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaptopChoice;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Laptop 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number 1 or 2");
    int num=sc.nextInt();
    
    if(num==2)
    {
        String model;
    String colour;
    boolean rgbKeyboard;
    String processor;
    double price;
    
    AcerLaptop(String model,String colour,boolean rgbKeyboard,String processor,double price)
    {
    this.colour=colour;
    this.model=model;
    this.price=price;
    
    this.processor=processor;
    this.rgbKeyboard=rgbKeyboard;
    }
    
    void display()
    {
        System.out.println("Model:"+model);
        System.out.println("Colour:"+colour);
        System.out.println("rgbKEYBOARD:"+rgbKeyboard);
        System.out.println("Processor:"+ processor);
        System.out.println("Price:"+price);
    }
            
            

    }
    
}
