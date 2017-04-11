package org.javacore.thread.object.dieLock;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class Run {
    public static void main(String[] args) {
            LockObject lock1 = new LockObject() ;
            LockObject lock2 = new LockObject();
            LockObject lock3 = new LockObject();

            DealThread dealThread = new DealThread(lock1,lock2,"线程1");
            DealThread dealThread2 = new DealThread(lock2,lock3,"线程2");
            DealThread dealThread3 = new DealThread(lock3,lock1,"线程3");

            Thread thread = new Thread(dealThread);
            Thread thread1 = new Thread(dealThread2);
            Thread thread2 = new Thread(dealThread3);

            lock1.setName("a");
            lock2.setName("b");
            lock3.setName("c");

            thread.start();
            thread1.start();
            thread2.start();
    }
}
