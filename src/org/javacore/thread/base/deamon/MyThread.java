package org.javacore.thread.base.deamon;

/**
 * Created by hetaoo on 2017/3/30.
 */
public class MyThread extends Thread {
    private int i = 0;
    @Override
    public void run() {
        try {
            super.run();
            while (true){
                System.out.println(++i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
