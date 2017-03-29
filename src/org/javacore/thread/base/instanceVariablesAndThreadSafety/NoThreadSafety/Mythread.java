package org.javacore.thread.base.instanceVariablesAndThreadSafety.NoThreadSafety;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

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


     public void run(){
        super.run();
        while (count > 0){
            count--;
            System.out.println("由 " + this.currentThread().getName() + "计算,count=" + count);
        }
    }
}
