package org.javacore.thread.object.synObjectClass;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceA();
    }
}
