/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAndStatic2;

/**
 *
 * @author Administrator
 */
public class Circle 
{
    final  double PI=3.14;
     double radius;
    Circle(double radius)
    {
    this.radius=radius;
    }
    public double calculateArea()
    {
    return PI*radius*radius;
    }
}
