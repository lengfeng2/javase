package com.szb.callable;

import java.util.concurrent.Callable;

/**
 * @author ww
 * @date 2020/6/3 11:17
 */
public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName() + " is running";
    }
}
