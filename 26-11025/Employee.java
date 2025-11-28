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
public class Employee
{
  String name;
  String name1;
  public Employee(String name,String name1)
  {
  this. name=name;
  this.name1=name1;
  }
  public void shoeRole()
  {
  System.out.println("Manager"+name);
      System.out.println("Developer"+name1);
  }
          
}
