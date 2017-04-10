package org.javacore.thread.object.ExcptionLock;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class MyThreadA extends Thread {
    private ExceptionClass exceptionClass;

    public MyThreadA(ExceptionClass exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    @Override
    public void run() {
        super.run();
        exceptionClass.testMethod();
    }
}
