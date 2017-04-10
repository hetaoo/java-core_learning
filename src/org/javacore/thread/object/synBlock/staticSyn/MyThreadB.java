package org.javacore.thread.object.synBlock.staticSyn;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }
}
