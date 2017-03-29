package org.javacore.thread.base.instanceVariablesAndThreadSafety.ThreadSafety;

/**
 * Created by hetaoo on 2017/3/29.
 */
public class Run {

    public static void main(String[] args){
        Mythread mythread = new Mythread();

        Thread thread = new Thread(mythread,"A");
        Thread thread1 = new Thread(mythread,"B");
        Thread thread2 = new Thread(mythread,"C");

        thread.start();
        thread1.start();
        thread2.start();
    }
}
