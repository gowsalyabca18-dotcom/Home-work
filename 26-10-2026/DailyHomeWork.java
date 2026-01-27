/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gowsalya.dailyhomework;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class DailyHomeWork {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=null;
        ArrayList<Integer> priceList=new ArrayList<>();
        int num;
        
        do{
            num=sc.nextInt();
            
            switch(num)
            {
                case 1:
                    
                    int len=sc.nextInt();
                    ar=new int[len];
                    
                    for(int i=0;i<len;i++)
                    {
                        ar[i]=sc.nextInt();
                    }
                    
                    System.out.println("Prices stored");
                    break;
                    
                case 2:
                    
                    if(ar !=null)
                    {
                        priceList.clear();
                        
                        for( int p:ar)
                          {
                             priceList.add(p);
                          }
                        System.out.println("Prices copied to ArrayList");
                        break;
                    }
                case 3:
                {
                    System.out.println("Prices:  ");
                    
                    for(int i=0;i<priceList.size();i++)
                    {
                        System.out.println(priceList.get(i)+(i==priceList.size()-1 ? "" :" "));
                    }
                    System.out.println();
                    break;
                }
                case 4:
                {
                if(!priceList.isEmpty())
                {
                    int max=Collections.max(priceList);
                    System.out.println("Maximum Price = " +max);
                }
                break;
                }
                case 5:
                {
                int del=sc.nextInt();
                
                if(priceList.contains(del));
                {
                   priceList.remove(Integer.valueOf(del));
                    System.out.println("Prices " +del + "removed ");
                    break;
                }
                }
                case 6:
                {
                    System.out.println("Exit");
                    break;
                }
                default:
                        {
                          System.out.println("Sorry invalid number please enter between 1 to 6");
                        }
                
            } 
        }while(num !=6);
    }
}
