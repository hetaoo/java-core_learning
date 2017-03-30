package org.javacore.thread.base.interruptedAndIsInterrupted.interrupted;

/**
 * Created by hetaoo on 2017/3/30.
 */
public class Mythread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i=0;i<50000;i++){
            System.out.println("i=" + ++i);
        }
    }
}
