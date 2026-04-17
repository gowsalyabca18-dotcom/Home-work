/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class SetPractice {
    public static void main(String[] args)
    {
        Set<Integer> num=new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(10);
        num.add(40);
        num.add(50);
        num.add(60);
        
        
        
//        System.out.println(num);
        
//     System.out.println(num.contains(40));
//         System.out.println(num.remove(10));
         
//         System.out.println(num);
         
         System.out.println(num.size());
         System.out.println(num);
    }
}
