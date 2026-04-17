/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Arraylist 
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        
        list.add("Apple");
        list.add("Orange");
        list.add("Papaya");
        list.add("Grape");
        list.add("Jackfruit");
        list.add("Banana");
        
        for(String fruit:list)
        {
            System.out.println(fruit);
        }
        
//        System.out.println(list);
        
        list.add(3, "Guava");
//        System.out.println(list);
         
         list.remove(2);
//         System.out.println(list);
        
         list.set(3, "GrapeFruit");
//          System.out.println( list);
         
//         list.get(3);
//         System.out.println(list.get(5));
          
//         System.out.println( list.isEmpty());
         
//            System.out.println( list.contains("Starfruit"));
//             System.out.println( list.size());
         
         list.indexOf("Apple");
          System.out.println(list.indexOf("Apple"));
          
    }
}
