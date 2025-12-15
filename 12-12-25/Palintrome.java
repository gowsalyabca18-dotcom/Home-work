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
public class Palintrome 
{
    public static void main(String[] args) 
    {
       String s1="dad";
       String s2="json";
       Palintrome p =new Palintrome();
        System.out.println(p.check(s1));
        System.out.println(p.check(s2));
    }
    public boolean check(String str)
    {
    String cleanstr=str.toLowerCase();
    String reverseStr="";
    for(int i=cleanstr.length()-1;i>=0;i++)
    {
    reverseStr=reverseStr+cleanstr.charAt(i);
    }
    if(cleanstr.equals(reverseStr))
    {
    return true;
    }
    else
    {
    return false;
    }
    }
 
}
