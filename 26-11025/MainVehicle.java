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
public class MainVehicle
{
   public static void main(String[] args)
   {
   car c=new car("Renault",180);
   c.showSpeed();
   c.showType();
   
   Bike b=new Bike("unicorn",120);
   b.showSpeed();
   b.showType();
   }
}
