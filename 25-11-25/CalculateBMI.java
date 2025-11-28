/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject.BMI;

/**
 *
 * @author Administrator
 */
public class CalculateBMI
{
    double weight;
    double height;
    double bmi;
    public CalculateBMI(double weight,double height)
    {
    this.height=height;
    this.weight=weight;
    this.bmi=calculate();
    }
    public double calculate()
    {
    return weight/(height*height);
    }
    public void printBMI()
    {
        System.out.println("BMI"+bmi);
    }
            
}
