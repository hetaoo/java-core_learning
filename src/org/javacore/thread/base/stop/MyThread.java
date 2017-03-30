package org.javacore.thread.base.stop;

/**
 * Created by hetaoo on 2017/3/30.
 */
public class MyThread extends Thread {
    private int i = 0;
    @Override
    public void run() {
        try {
            super.run();
            while (true) {
                System.out.println("i = " + i++);
                if (this.isInterrupted()) {
                    throw new InterruptedException("Thread Interrupted!");
                }
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束了！");
    }
}
