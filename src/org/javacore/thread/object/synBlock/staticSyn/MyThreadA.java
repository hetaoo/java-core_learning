package org.javacore.thread.object.synBlock.staticSyn;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printA();
    }
}
