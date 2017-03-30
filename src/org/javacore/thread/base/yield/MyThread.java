package org.javacore.thread.base.yield;

/**
 * Created by hetaoo on 2017/3/30.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i=0;i<50000;i++) {
            //Thread.yield();
            count = count + ++i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时： " + (endTime - beginTime));
    }
}
