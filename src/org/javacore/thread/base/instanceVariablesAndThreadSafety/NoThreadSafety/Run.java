package org.javacore.thread.base.instanceVariablesAndThreadSafety.NoThreadSafety;

/**
 * Created by hetaoo on 2017/3/29.
 */
public class Run {
    public static  void main(String[] args){
        Mythread mythread = new Mythread("A");
        Mythread mythread1 = new Mythread("B");
        Mythread mythread2 = new Mythread("C");
        Mythread mythread3 = new Mythread("D");

        mythread.start();
        mythread1.start();
        mythread2.start();
        mythread3.start();

    }
}
