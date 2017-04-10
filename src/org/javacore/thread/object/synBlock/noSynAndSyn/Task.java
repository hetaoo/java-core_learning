package org.javacore.thread.object.synBlock;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Task {
    public void doLongTimeTask() {
        for (int i=0;i<100;i++) {
            try {
                System.out.println("noSynchronized threadName = " + Thread.currentThread().getName() + " i = " + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
        synchronized (this) {
            for(int i=0;i<100;i++) {
                try {
                    System.out.println("Synchronized threadName = " + Thread.currentThread().getName() + " i = " + i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
