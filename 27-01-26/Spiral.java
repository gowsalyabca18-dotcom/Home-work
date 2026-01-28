/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gowsalya.dailyhomework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Spiral 
{
 
    public static void main(String[] args) 
    {
        int rows =5;
        int column = 4;
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        
        List<Integer> res = new ArrayList<>();
        int top =0;
        int bottom = rows-1;
        int left = 0;
        int right = column-1;
        
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                res.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++)
            {
                res.add(matrix[i][right]);
            }
            right--;
            
            if(top<=bottom)
            {
            for(int i=right;i>=left;i--)
            {
                res.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right)
            {
            for(int i=bottom;i>=right;i--)
            {
                res.add(matrix[i][left]);
            }
            left++;
            }
        }
        for(int result:res)
        {
            System.out.print(result+" ");
        }
    }

}
