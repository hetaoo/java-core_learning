package org.javacore.thread.object.ExcptionLock;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class ExceptionClass {
    public synchronized void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " run beginTime +" +
            System.currentTimeMillis());

            while (true) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("ThreadName = " + Thread.currentThread().getName() + " run exception Time +" +
                            System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }

        }else{
            System.out.println("Thread B run time = " + System.currentTimeMillis());
        }
    }
}
