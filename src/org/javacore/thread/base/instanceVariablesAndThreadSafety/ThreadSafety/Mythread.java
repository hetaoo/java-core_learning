package org.javacore.thread.base.instanceVariablesAndThreadSafety.ThreadSafety;

/**
 * Created by hetaoo on 2017/3/29.
 */
public class Mythread extends Thread{
    private int count = 5;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public Mythread(String name) {
        super(name);
    }

    public Mythread() {

    }

    /**
     * 加上synchronized 转为线程安全
     */
    synchronized public void run(){
        super.run();
            count--;
            System.out.println("由 " + this.currentThread().getName() + "计算,count=" + count);
    }
}
