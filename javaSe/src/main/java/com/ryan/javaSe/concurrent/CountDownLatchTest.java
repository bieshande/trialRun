package com.ryan.javaSe.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:biexiande@hisense.com
 * @date:2018/2/12 16:15
 * @des
 */
public class CountDownLatchTest {
    private static CountDownLatch  countDownLatch= new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程一");
                try {
                    TimeUnit.SECONDS.sleep(3);
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程二");
                try {
                    TimeUnit.SECONDS.sleep(4);
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程三");
                try {
                    TimeUnit.SECONDS.sleep(5);
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("都执行完了");
        System.out.println(end-start);


    }


}