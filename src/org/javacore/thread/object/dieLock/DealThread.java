package org.javacore.thread.object.dieLock;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class DealThread implements Runnable {
    private LockObject lock1 ;
    private LockObject lock2 ;
    private String threadName;

    public DealThread(LockObject lock1, LockObject lock2,String threadName) {
        this.lock1 = lock1;
        this.lock2 = lock2;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock1) {
                System.out.println(threadName + "获得锁对象：" + lock1.getName());
                System.out.println(threadName +  "等待获取锁: " + lock2.getName());
                synchronized (lock2) {
                    System.out.println(threadName +  "获得锁对象：" + lock2.getName());
                }
            }
        }
    }
}
