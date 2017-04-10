package org.javacore.thread.object.synLockIn.synLockIn2;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Sun extends Main {

    public synchronized void operateISunMethod() {
        super.operateIMainMethod();
        try {
            while (i > 0) {
                i--;
                System.out.println("Sun print i = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
