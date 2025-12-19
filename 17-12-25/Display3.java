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
public abstract class Display3 implements Runnable
{
        String message ="Sure, Java is a Programming Language, Which is used for develop applications with platform Independent.";
    
    @Override
    public void run()
    {
        for(int i=0;i<message.length();i++)
        {
            char ch = message.charAt(i);
            
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException obj)
            {
                System.out.println("Thread Interrupted");
            }
            System.out.print(ch);
        }
        System.out.println();
    }

}
