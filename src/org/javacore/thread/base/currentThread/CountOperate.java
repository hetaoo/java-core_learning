package org.javacore.thread.base.currentThread;

/**
 * Created by hetaoo on 2017/3/29.
 */
public class CountOperate extends Thread{

    public CountOperate(){
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("This.getName()=" + this.getName());
        System.out.println("CountOperate---end");
    }

    public void run(){
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("This.getName()=" + this.getName());
        System.out.println("run---end");
    }
}
