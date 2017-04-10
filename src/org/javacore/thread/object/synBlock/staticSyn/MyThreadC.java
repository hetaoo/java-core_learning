package org.javacore.thread.object.synBlock.staticSyn;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class MyThreadC extends Thread {
    private Service service;

    public MyThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}
