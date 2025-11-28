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
public class MainArea 
{
    public static void main(String[] args)
    {
    
    AreaCalculation are=new AreaCalculation();
    Circle c=new Circle(5.0);
    Rectangle r=new Rectangle(4.0,6.0);
    are.calculateArea();
    are.displayShapeInfo();
    c.calculateArea();
    c.displayShapeInfo();r.calculateArea();
    r.calculateArea();
    r.displayShapeInfo();
    }
}
