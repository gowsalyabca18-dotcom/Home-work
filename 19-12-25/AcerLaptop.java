/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laptop;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 *
 * @author Administrator
 */
public class AcerLaptop 
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
