package com.grind.misc;
public class WaitNotifyTest 
{
    public static void main(String[] args) 
    {
        Message1 msg = new Message1("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter, "waiter").start();

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();

        System.out.println("All the threads are started");
    }
}
