package org.javacore.thread.object.synObjectClass;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class Service {
    synchronized static public void serviceA() {
        try {
            System.out.println("Thread Name = " + Thread.currentThread().getName() + " 进入Print: AA");
            Thread.sleep(1000);
            System.out.println("Thread Name = " + Thread.currentThread().getName() + " 离开Print: AA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized static public void serviceB() {
        System.out.println("Thread Name = " + Thread.currentThread().getName() + " 进入Print: BB");
        System.out.println("Thread Name = " + Thread.currentThread().getName() + " 离开Print: BB");
    }
}
