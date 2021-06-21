/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class MyRunnableThread
{
    public static int myCount = 0;
    public MyRunnableThread()
    {
        
    }
    public void run()
    {
        while (MyRunnableThread.myCount <=10)
        {
            try
            {
                System.out.println("Expl Thread. " +(++MyRunnableThread.myCount));
                Thread.sleep(100);
            }
            catch(InterruptedException iex)
            {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Starting Min Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread();
        t.start();
        while (MyRunnableThread.myCount <=10)
        {
            try
            {
                System.out.println("Main Thread. " +(++MyRunnableThread.myCount));
                Thread.sleep(100);
            }
            catch(InterruptedException iex)
            {
                System.out.println("Exception in main thread: " +iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
