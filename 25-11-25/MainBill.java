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
public class MainBill 
{
    public static void main(String[] args)
    {
    ElectricBill eb=new ElectricBill(250,5.5);
    eb.calculateBill();
    }
}
