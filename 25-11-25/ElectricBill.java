/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject.EbBILL;

/**
 *
 * @author Administrator
 */
public class ElectricBill
{
   int unit;
   double cost;
   double totalBill;
   public ElectricBill(int unit,double cost)
   {
   this.unit=unit;
   this.cost=cost;
   this.totalBill=calculateTotalBill();
   }
   public double calculateTotalBill()
   {
    return (unit*cost);
   }
   public void calculateBill()
   {
       System.out.println("TotalUnits"+unit);
       System.out.println("Cost Per Units"+cost);
       System.out.println("Total Bill"+totalBill);
   }
}
