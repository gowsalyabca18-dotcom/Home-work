/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Administrator
 */
public class MainAnimal 
{
  public static void main(String args[])
  {
  Animal a=new Animal();
  a.makingSound();
  Dog d=new Dog();
  d.makingSound();
  Cat c=new Cat();
  c.makingSound();
  
  }
}
