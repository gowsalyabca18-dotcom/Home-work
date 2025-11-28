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
public class vehicle 
{
   String type;
   int speed;
   public vehicle(String type,int speed)
   {
   this.type=type;
   this.speed=speed;
   }
   public void showType()
   {
       System.out.println("Vehicle type"+type);
   }
   public void showSpeed()
   {
       System.out.println("Vehicle Speed"+speed);
   }
}
