package org.javacore.thread.object.synBlock;

/**
 * Created by hetaoo on 2017/4/10.
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread myThread = new MyThread(task);
        myThread.start();
        task.doLongTimeTask();
    }
}
