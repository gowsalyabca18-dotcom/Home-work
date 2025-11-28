/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance2;

/**
 *
 * @author Administrator
 */
public class Rectangle extends AreaCalculation
{
   double length;
   double width;
   public Rectangle(double length,double width)
   {
   this.length=length;
   this.width=width;
   }
   public double calculateArea()
   {
   
   return (length*width);
   }
}
