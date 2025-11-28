/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance1;

/**
 *
 * @author Administrator
 */
public class MainEmployee 
{
  public static void main(String[] args)
  {
  Manager m=new Manager("Ravi");
  m.shoeRole();
  Developer d=new Developer("Meena");
  m.shoeRole();
  }
}
