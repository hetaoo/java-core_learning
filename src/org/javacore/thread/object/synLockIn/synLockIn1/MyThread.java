package org.javacore.thread.object.synLockIn.synLockIn1;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}
