/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Administrator
 */
public class car extends vehicle 
{
    public car(String model,int maxspeed)
    {
    super(model,maxspeed);
    }
   public void showType()
   {
       System.out.println("Car Model"+type);
   }
   public void showSpeed()
   {
       System.out.println("Car Speed"+speed);
   }
    
}
