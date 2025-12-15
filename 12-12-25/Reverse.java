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
public class Reverse 
{
    public static void main(String[] args)
    {
        String s="java";
        Reverse r=new Reverse();
        
        System.out.println(r.reverse(s));
        
    }
    public String reverse(String str)
    {
    String reverseStr="";
    for(int i=str.length()-1;i>=0;i--)
    {
    reverseStr=reverseStr+str.charAt(i);
    }
    return reverseStr;
    }
}
