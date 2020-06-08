package com.szb.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ww
 * @date 2020/5/27 17:41
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        System.out.println(System.currentTimeMillis());
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟3秒执行");
                System.out.println(System.currentTimeMillis());
            }
        },3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
