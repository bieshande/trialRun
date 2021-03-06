package com.ryan.javaSe.thread;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/1/2 16:39
 * @des
 */
public class TestJoin
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new T1(), "线程1");
        Thread t2 = new Thread(new T2(), "线程2");
        Thread t3 = new Thread(new T3(), "线程3");

        try
        {
            //t1先启动
            t1.start();
            t1.join();
            //t2
            t2.start();
            t2.join();
            //t3
            t3.start();
            t3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class T1 implements Runnable{

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName()+": "+i);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class T2 implements Runnable{

    @Override
    public void run()
    {
        for (int j = 5; j < 10; j++)
        {
            System.out.println(Thread.currentThread().getName()+": "+j);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class T3 implements Runnable{
    @Override
    public void run()
    {

        for (int i = 10; i < 15; i++)
        {
            System.out.println(Thread.currentThread().getName()+": "+i);
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}