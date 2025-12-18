/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Administrator
 */
public class ThreadNane {

 
    public static void main(String[] args) 
    {
       String str[] = {"Diwakar","Karthi","Rajesh","Sathish","Surya"};
       
       Name n = new Name(str);
       n.start();
    }
    
}
