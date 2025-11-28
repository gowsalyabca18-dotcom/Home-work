/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject.CircleAreaCalculation;

/**
 *
 * @author Administrator
 */
public class Circle
{
    double radius;
    double area;
    public Circle(double radius)
    {
    this.radius=radius;
    this.area=calculateArea();
    }
    public double calculateArea()
    {
    return (22/7*radius*radius);
    }
    public void showArea()
    {
        System.out.println("Area of the Circle is:"+area);
    }
}
