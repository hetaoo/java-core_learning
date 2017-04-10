package org.javacore.thread.object.synLockIn.synLockIn2;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Main {
    int i = 10;
    synchronized public void operateIMainMethod() {
        try {
            System.out.println("main print i = " + --i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
