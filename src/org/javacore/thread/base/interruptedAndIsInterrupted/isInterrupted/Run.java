package org.javacore.thread.base.interruptedAndIsInterrupted.isInterrupted;

/**
 * Created by hetaoo on 2017/3/30.
 */
public class Run {
    public static void main(String[] args){
            Mythread mythread = new Mythread();
            mythread.start();
            System.out.println("是否停止1？ = " + mythread.isInterrupted());
            System.out.println("是否停止2？ = " + mythread.isInterrupted());
    }
}
