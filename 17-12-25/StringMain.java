/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadStringMain;

/**
 *
 * @author Administrator
 */
public class StringMain
{
    public static void main(String[] args) 
    {
           {
        Display d = new Display() {} ; 
        Display1 d1 = new Display1();
        Display2 d2 = new Display2();
        Display3 d3 = new Display3();
        
        Thread th = new Thread(d);
        Thread th1 = new Thread(d1);
        Thread th2 = new Thread(d2);
        Thread th3 = new Thread(d3);
        
        th.start();
        th.join();
        th1.start();
        th1.join();
        th2.start();
        th2.join();
        th3.start();
    }
    

    }
 
}
