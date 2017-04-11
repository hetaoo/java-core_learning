package org.javacore.thread.object.volatile1;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class Run {
    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
