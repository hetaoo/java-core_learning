package org.javacore.thread.object.volatile1;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("进入run方法");
        while (isRunning) {

        }
        System.out.println("线程停止");
    }
}
