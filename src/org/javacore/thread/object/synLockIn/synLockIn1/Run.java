package org.javacore.thread.object.synLockIn.synLockIn1;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
