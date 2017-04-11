package org.javacore.thread.object.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class AtomicThread extends Thread {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        super.run();
        for (int i=0;i<10;i++) {
            System.out.println(atomicInteger.incrementAndGet());
        }
    }
}
