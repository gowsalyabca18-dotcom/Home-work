/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAndStatic3;

/**
 *
 * @author Administrator
 */
public class Bank
{
   final String accountNumber;
   Bank(String accountNumber)
   {
   this.accountNumber=accountNumber;
   }
   void display()
   {
       System.out.println(accountNumber);
   }
}
