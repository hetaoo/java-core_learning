package org.javacore.thread.object.atomic;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class Run {
    public static void main(String[] args) {
        AtomicThread atomicThread = new AtomicThread();
        Thread thread = new Thread(atomicThread);
        thread.start();
        Thread thread1 = new Thread(atomicThread);
        thread1.start();
        Thread thread2 = new Thread(atomicThread);
        thread2.start();
    }
}
