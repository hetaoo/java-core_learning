package org.javacore.thread.object.synBlock.noSynAndSyn;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class MyThread extends Thread {
    private Task task;

    public MyThread(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
