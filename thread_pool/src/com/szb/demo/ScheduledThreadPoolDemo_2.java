package com.szb.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ww
 * @date 2020/5/28 9:55
 */
public class ScheduledThreadPoolDemo_2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        System.out.println(System.currentTimeMillis());
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒执行,每3秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,3, TimeUnit.SECONDS);
    }
}
