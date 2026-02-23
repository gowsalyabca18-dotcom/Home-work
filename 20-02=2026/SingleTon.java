/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desingpattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

/**
 *
 * @author Administrator
 */
public class SingleTon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Single obj1 = Single.getInstance();

      
        Single obj2 = Single.getInstance();

        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);

        
        if (obj1 == obj2) {
            System.out.println("Both references point to the SAME object.");
        } else {
            System.out.println("Different objects created.");
        }
    }
}
