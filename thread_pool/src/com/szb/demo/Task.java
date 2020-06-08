package com.szb.demo;

/**
 * @author ww
 * @date 2020/5/27 16:06
 */
public class Task implements Runnable{
    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+" running");

    }
}
