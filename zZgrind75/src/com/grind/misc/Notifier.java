package com.grind.misc;
public class Notifier implements Runnable 
{
    private Message1 msg;

    public Notifier(Message1 m) {
        this.msg = m;
    }

    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        try 
        {
            Thread.sleep(1000);
            synchronized (msg) 
            {
                msg.setMsg(name + " Notifier work done");
                msg.notify();
                // or msg.notifyAll();
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
