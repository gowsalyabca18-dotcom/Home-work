/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject.TaxDedection;

/**
 *
 * @author Administrator
 */
public class Employee 
{
   String name;
   double salary;
   double taxRate=0.10;
   double netSalary;
   public Employee(String name,double salary)
   {
   this.name=name;
   this.salary=salary;
   this.netSalary=calculateSalary();
   }
   public double calculateSalary()
   {
   double taxAmount=salary*taxRate;
   return(salary-taxAmount);
   }
   public void showNetSlary()
   {
       System.out.println("Name"+name);
       System.out.println("Gross Salary"+salary);
       System.out.println("Tax:"+taxRate);
       System.out.println("Net Salary"+netSalary);

   }
}
