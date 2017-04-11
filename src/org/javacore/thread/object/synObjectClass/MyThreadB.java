package org.javacore.thread.object.synObjectClass;

/**
 * Created by hetaoo on 2017/4/11.
 */
public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceB();
    }
}
