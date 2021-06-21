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
public class MyThread extends Thread
{
    public void run()
    {
        System.out.println("concurrent thread started running..");
    }
    public static void main(String[] args)
    {
        MyThread mt = new MyThread();
        mt.start();
    }
}
