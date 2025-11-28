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
public class Circle extends AreaCalculation
{
    double radius;
    public Circle(double radius)
    {
    this.radius=radius;
    }
    public double calculateArea()
    {
    return(22/7*radius*radius);
    }
}
