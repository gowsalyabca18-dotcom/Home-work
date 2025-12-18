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
public class Name extends Thread
{
    String str[];
    Name(String str[])
    {
        this.str = str;
    }
    @Override
    public void run()
    {
        for(int i=0;i<str.length;i++)
        {
            
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException obj)
            {
                System.out.println("Sleep Interrupted");
            }
            System.out.print(str[i]);
        }
        System.out.println();
    }
}
