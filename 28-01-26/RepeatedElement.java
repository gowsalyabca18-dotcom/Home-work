/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gowsalya.dailyhomework;

/**
 *
 * @author Administrator
 */
public class RepeatedElement
{
    public static void main(String[] args)
    {
        String word = "abbccccc";
        StringBuilder stb = new StringBuilder();
        
        for(int i=0;i<word.length();i++)
        {
            int count = 1;
            while((i<word.length()-1)&&(word.charAt(i)==word.charAt(i+1)))
            {
                count++;
                i++;
            }
            stb.append(word.charAt(i));
            
            if(count>1)
            {
                stb.append(count);
            }
        }
        
        System.out.println("Input: "+word);
        System.out.println("Output: "+stb.toString());
    }
}
    

