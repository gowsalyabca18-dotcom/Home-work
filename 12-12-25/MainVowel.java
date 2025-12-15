/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vowel;

/**
 *
 * @author Administrator
 */
public class MainVowel 
{
    public static void main(String[] args)
    {
          VowelCount vc=new VowelCount(); 
          String s1="hello";
          String s2="instance";
          System.out.println(vc.count(s2));
          System.out.println(vc.count(s1));
    }
  
    
}
