/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject.DiscountCalculate;

/**
 *
 * @author Administrator
 */
public class Calculate
{
    double price;
    double discountPercentage;
    double finalPrice;
    public Calculate(double price,double discountPercentage)
    {
    this.price=price;
    this.discountPercentage=discountPercentage;
    this.finalPrice=calculateFinalPrice();
    }
    public double calculateFinalPrice()
    {
    double discountAmount=price*(discountPercentage/100);
    return price-discountAmount;
    }
    public void printFinalPrice()
    {
        System.out.println("Original Price"+price);
        System.out.println("Discount"+discountPercentage+"%");
        System.out.println("FinalPrice"+finalPrice);
    }
}
