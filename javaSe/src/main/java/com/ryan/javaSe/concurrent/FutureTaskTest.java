package com.ryan.javaSe.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @Auther:biexiande@hisense.com
 * @date:2017/12/22 9:53
 * @des
 */
public class FutureTaskTest {
    public static void main(String[] args) {
        ExecutorService executor = new ScheduledThreadPoolExecutor(2);
        FutureTask future =  new FutureTask(()->{
            System.out.println("FutureTask sleep..., Time is " + System.currentTimeMillis());
            Thread.sleep(5000);
            return "OK";
        });
        //AbstractQueuedSynchronizer
        executor.execute(future);
        System.out.println("MainThread sleep..., Time is " + System.currentTimeMillis());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = "";
        try {
            System.out.println(System.currentTimeMillis());
            result = (String)future.get();   //等待了 1000ms 得到结果
            System.out.println(System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("result is " + result + ", Time is " + System.currentTimeMillis());

    }
}