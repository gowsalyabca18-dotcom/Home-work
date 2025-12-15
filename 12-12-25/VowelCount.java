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
public class VowelCount 
{
    public int count(String str)
    {
    int count =0;
    String lowerstr=str.toLowerCase();
    for(int i=0;i<lowerstr.length();i++)
    {
    char ch=lowerstr.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        count++;
    }
    }
    return count;
}
