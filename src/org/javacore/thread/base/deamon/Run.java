package org.javacore.thread.base.deamon;

/**
 * Created by hetaoo on 2017/3/30.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            Thread.sleep(10000);
            System.out.println("结束了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
