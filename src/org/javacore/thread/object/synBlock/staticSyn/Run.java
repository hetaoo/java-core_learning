package org.javacore.thread.object.synBlock.staticSyn;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.setName("A");
        myThreadA.start();

        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.setName("B");
        myThreadB.start();

        MyThreadC myThreadC = new MyThreadC(service);
        myThreadC.setName("C");
        myThreadC.start();
    }
}
