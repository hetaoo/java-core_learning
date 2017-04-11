package org.javacore.thread.object.synObjectClass;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        Service service1 = new Service();
        Service service2 = new Service();

        MyThreadA myThreadA = new MyThreadA(service);
        MyThreadB myThreadB = new MyThreadB(service1);

        myThreadA.setName("A");
        myThreadB.setName("B");

        myThreadA.start();
        myThreadB.start();

    }
}
