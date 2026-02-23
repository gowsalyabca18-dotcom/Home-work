/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desingpattern;

/**
 *
 * @author Administrator
 */
public class Single
{
   
    private static Single instance;

 
    private Single() {
        System.out.println("Singleton Constructor Called");
    }

 
    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}

