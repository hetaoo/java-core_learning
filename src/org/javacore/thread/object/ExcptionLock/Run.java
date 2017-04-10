package org.javacore.thread.object.ExcptionLock;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Run {
    public static void main(String[] args) {
        try {
            ExceptionClass exceptionClass = new ExceptionClass();
            MyThreadA myThreadA = new MyThreadA(exceptionClass);
            MyThreadB myThreadB = new MyThreadB(exceptionClass);
            myThreadA.setName("a");
            myThreadB.setName("b");
            myThreadA.start();
            Thread.sleep(100);
            myThreadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
